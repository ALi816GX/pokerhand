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


    /**
     * player with different type poker to compare
     * @param player1
     * @param player2
     * @return
     */
    public static Player comparePlayer(Player player1, Player player2){



        if(isPairPoker(player1) || isPairPoker(player2)){
            return isPairPoker(player1)?player1:player2;
        }


        return compareHighPoker(player1,player2);


    }


    public static boolean isPairPoker(Player player){

        List<Poker> list = player.getPokers();

        int result = 1;

        for(int i = 0;i < list.size() - 1;i++){
            if(list.get(i).getNum() != list.get(i+1).getNum()){
                result++;
            }
        }

        return result != list.size();

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

        if(comparePoker(pokers1,pokers2) == null){
            return null;
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

            if(comparePoker(poker1,poker2) != null){
                return comparePoker(poker1,poker2) == poker1 ? list1:list2;
            }

        }

        return null;

    }

    /**
     * single poker compare
     * @param poker1
     * @param poker2
     * @return null: both are same equal
     */
    private static Poker comparePoker(Poker poker1, Poker poker2){

        if(poker1.getNum() == poker2.getNum()){
            return null;
        }

        return poker1.getNum() > poker2.getNum()?poker1:poker2;

    }





}
