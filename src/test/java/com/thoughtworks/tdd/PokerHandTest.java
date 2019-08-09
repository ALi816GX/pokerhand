package com.thoughtworks.tdd;

import org.junit.Assert;
import org.junit.Test;



/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/8/9
 * @Time:13:49
 * @description:
 */
public class PokerHandTest {


    @Test
    public void should_return_poker2_when_call_compare_given_2H_3D() {

        Poker poker1 = new Poker('2', 'H');
        Poker poker2 = new Poker('3', 'D');

        Poker result = poker1.comparePoker(poker2);

        Assert.assertEquals(poker2,result);

    }



}