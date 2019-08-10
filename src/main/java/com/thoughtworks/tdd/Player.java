package com.thoughtworks.tdd;

import java.util.*;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/8/10
 * @Time:02:05
 * @description:
 */
public class Player {

    private List<Poker> pokers;

    private int pokerLevel;

    private List<Poker> repeatedPokers;



    public Player(List<Poker> list){

        this.pokers = list;

        changePokers();

        sortPoker(this.pokers);

        judgeLevel();

    }


    /**
     *
     */
    private void judgeLevel(){

        if(isDoublePairPoker()){
            this.pokerLevel = LevelConstant.DOUBLE_PAIR_POKER;
            setRepeatedPokers();
        }
        else if(isPairPoker()){
            this.pokerLevel = LevelConstant.PAIR_POKER;
            setRepeatedPokers();
        }
        else {
            this.pokerLevel = LevelConstant.HIGH_POKER;
        }

    }

    private void setRepeatedPokers(){

        Set<Poker> set = new HashSet<>();

        List<Poker> list = this.getPokers();


        for(int i = 0;i < list.size() - 1;i++){
            if(list.get(i).getNum() == list.get(i+1).getNum()){
                set.add(list.get(i));
            }
        }

        this.repeatedPokers = new ArrayList<>(set);

        sortPoker(this.repeatedPokers);


    }


    /**
     * is Poker type as Double Pair
     * @return
     */
    private boolean isDoublePairPoker(){

        List<Poker> list = this.getPokers();

        int result = 0;

        for(int i = 0;i < list.size() - 1;i++){
            if(list.get(i).getNum() == list.get(i+1).getNum()){
                result++;
            }
        }

        return result == 2;

    }


    /**
     * is Poker type as Pair
     * @return
     */
    private boolean isPairPoker(){

        List<Poker> list = this.getPokers();

        int result = 1;

        for(int i = 0;i < list.size() - 1;i++){
            if(list.get(i).getNum() != list.get(i+1).getNum()){
                result++;
            }
        }

        return result != list.size();

    }



    /**
     * change pokers in order to sort
     */
    private void changePokers(){

        for(Poker poker:this.pokers){
            if(poker.getNum() > '9'){
                changePoker(poker);
            }
        }

    }


    /**
     * in order to sort conveniently
     * @param poker
     */
    private void changePoker(Poker poker){

        switch (poker.getNum()){
            case 'T':
                poker.setNum('A');
                break;
            case 'J':
                poker.setNum('B');
                break;
            case 'Q':
                poker.setNum('C');
                 break;
            case 'K':
                poker.setNum('D');
                break;
            case 'G':
                poker.setNum('0');
                break;

        }

    }


    /**
     * sort Pokers
     */
    private void sortPoker(List<Poker> pokers){
        pokers.sort(Comparator.comparingInt(Poker::getNum).reversed());
    }


    public List<Poker> getPokers() {
        return pokers;
    }


    public int getPokerLevel() {
        return pokerLevel;
    }


    public List<Poker> getRepeatedPokers() {
        return repeatedPokers;
    }



}