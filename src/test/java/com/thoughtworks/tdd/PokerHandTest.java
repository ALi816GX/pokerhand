package com.thoughtworks.tdd;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


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

        Poker result = PokerCompareUtil.comparePoker(poker1,poker2);

        Assert.assertEquals(poker2,result);

    }


    @Test
    public void should_return_pokers2_when_call_compare_given_2H4D_3H4S() {

        Poker poker1 = new Poker('2', 'H');
        Poker poker2 = new Poker('4', 'D');
        Poker poker3 = new Poker('3', 'H');
        Poker poker4 = new Poker('4', 'S');

        List<Poker> pokers1 = Arrays.asList(poker1,poker2);
        List<Poker> pokers2 = Arrays.asList(poker3,poker4);

        List<Poker> result = PokerCompareUtil.comparePoker(pokers1,pokers2);

        Assert.assertEquals(pokers2,result);

    }


    @Test
    public void should_return_pokers2_when_call_compare_given_24679_34789() {

        Poker poker1 = new Poker('2', 'H');
        Poker poker2 = new Poker('4', 'D');
        Poker poker3 = new Poker('6', 'H');
        Poker poker4 = new Poker('7', 'S');
        Poker poker5 = new Poker('9', 'S');

        Poker poker6 = new Poker('3', 'S');
        Poker poker7 = new Poker('4', 'D');
        Poker poker8 = new Poker('7', 'S');
        Poker poker9 = new Poker('8', 'C');
        Poker poker10 = new Poker('9', 'C');

        List<Poker> pokers1 = Arrays.asList(poker1,poker2,poker3,poker4,poker5);
        List<Poker> pokers2 = Arrays.asList(poker6,poker7,poker8,poker9,poker10);

        List<Poker> result = PokerCompareUtil.comparePoker(pokers1,pokers2);

        Assert.assertEquals(pokers2,result);

    }








}