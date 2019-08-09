package com.thoughtworks.tdd;

import java.util.Comparator;
import java.util.List;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/8/10
 * @Time:00:57
 * @description:
 */
public class PokerCompareUtil {


    /**
     * single poker compare
     * @param poker1
     * @param poker2
     * @return null: both are same equal
     */
    public static Poker comparePoker(Poker poker1, Poker poker2){

        if(poker1.getNum() == poker2.getNum()){
            return null;
        }

        return poker1.getNum() >= poker2.getNum()?poker1:poker2;

    }


    /**
     * several pokers compare
     * @param list1
     * @param list2
     * @return  null: both are same equal
     */
    public static List<Poker> comparePoker(List<Poker> list1, List<Poker> list2){


        list1.sort(Comparator.comparingInt(Poker::getNum).reversed());
        list2.sort(Comparator.comparingInt(Poker::getNum).reversed());

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




}
