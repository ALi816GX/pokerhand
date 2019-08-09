package com.thoughtworks.tdd;

import java.util.Comparator;
import java.util.List;

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

    public Player(List<Poker> list){

        this.pokers = list;

        changePokers();

        sortPoker();

    }


    /**
     * sort Pokers
     */
    private void sortPoker(){
        this.pokers.sort(Comparator.comparingInt(Poker::getNum).reversed());
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


    public List<Poker> getPokers() {
        return pokers;
    }

    public void setPokers(List<Poker> pokers) {
        this.pokers = pokers;
    }
}