package com.thoughtworks.tdd;

import java.util.*;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/8/10
 * @Time:00:57
 * @description:
 *
 *
 */
public class PokerCompareUtil {

    private static final Player SAME_LEVEL = null;
    private static final List<Poker> SAME_POKERS = null;
    private static final Poker SAME_POKER = null;


    /**
     * player with different type poker to compare
     * @param player1
     * @param player2
     * @return
     */
    public static Player comparePlayer(Player player1, Player player2){


        if(compareDifferentLevelPoker(player1,player2) != SAME_LEVEL){
            return compareDifferentLevelPoker(player1,player2);
        }

        else {

            switch (player1.getPokerLevel()){

                case LevelConstant.DOUBLE_PAIR_POKER:
                    if(compareDoublePairPoker(player1,player2) != SAME_LEVEL) {
                        return compareDoublePairPoker(player1, player2);
                    }
                    break;

                case LevelConstant.PAIR_POKER:
                    if(comparePairPoker(player1,player2) != SAME_LEVEL){
                        return comparePairPoker(player1,player2);
                    }
                    break;

                default:
                    return compareHighPoker(player1,player2);

            }

            return compareHighPoker(player1,player2);

        }

    }



    /**
     * different level compare
     * @param player1
     * @param player2
     * @return null:the same level
     */
    private static Player compareDifferentLevelPoker(Player player1,Player player2){

        if(player1.getPokerLevel() == player2.getPokerLevel()){
            return SAME_LEVEL;
        }

        return  player1.getPokerLevel() > player2.getPokerLevel() ? player1:player2;

    }


    /**
     * Double Poker compare
     * @param player1
     * @param player2
     * @return
     */
    private static Player compareDoublePairPoker(Player player1,Player player2){

        List<Poker> pokers1 = player1.getRepeatedPokers();
        List<Poker> pokers2 = player2.getRepeatedPokers();

        if(comparePoker(pokers1,pokers2) != SAME_POKERS){
            return comparePoker(pokers1,pokers2) == pokers1 ? player1 : player2;
        }

        return SAME_LEVEL;


    }


    /**
     * Pair Poker compare
     * @param player1
     * @param player2
     * @return
     */
    private static Player comparePairPoker(Player player1,Player player2){

        Poker poker1 = player1.getPairPoker();
        Poker poker2 = player2.getPairPoker();

        if(comparePoker(poker1,poker2) != SAME_POKER){
            return comparePoker(poker1,poker2) == poker1?player1:player2;
        }

        return SAME_LEVEL;

    }



    /**
     * High poker compare
     * @param player1
     * @param player2
     * @return
     */
    private static Player compareHighPoker(Player player1,Player player2){

        List<Poker> pokers1 = player1.getPokers();
        List<Poker> pokers2 = player2.getPokers();

        if(comparePoker(pokers1,pokers2) == SAME_POKER){
            return SAME_LEVEL;
        }

        return comparePoker(pokers1,pokers2) == pokers1 ? player1 : player2;

    }



    /**
     * several pokers compare
     * @param list1
     * @param list2
     * @return  null: both are same equal
     */
    private static List<Poker> comparePoker(List<Poker> list1, List<Poker> list2){


        Poker poker1;
        Poker poker2;

        for(int i = 0;i < list1.size();i++){
            poker1 = list1.get(i);
            poker2 = list2.get(i);

            if(comparePoker(poker1,poker2) != SAME_POKER){
                return comparePoker(poker1,poker2) == poker1 ? list1:list2;
            }

        }

        return SAME_POKERS;

    }

    /**
     * single poker compare
     * @param poker1
     * @param poker2
     * @return null: both are same equal
     */
    private static Poker comparePoker(Poker poker1, Poker poker2){

        if(poker1.getNum() == poker2.getNum()){
            return SAME_POKER;
        }

        return poker1.getNum() > poker2.getNum()?poker1:poker2;

    }





}
