package com.thoughtworks.tdd;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;


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
    public void should_return_poker2_when_call_comparePlayer_given_2H_3D() {

        Poker poker1 = new Poker('2', 'H');
        Poker poker2 = new Poker('3', 'D');


        Player player1 = new Player(Arrays.asList(poker1));
        Player player2 = new Player(Arrays.asList(poker2));


        Player result = PokerCompareUtil.comparePlayer(player1,player2);

        Assert.assertEquals(player2,result);

    }


    @Test
    public void should_return_pokers2_when_call_comparePlayer_given_2H4D_3H4S() {

        Poker poker1 = new Poker('2', 'H');
        Poker poker2 = new Poker('4', 'D');
        Poker poker3 = new Poker('3', 'H');
        Poker poker4 = new Poker('4', 'S');

        Player player1 = new Player(Arrays.asList(poker1,poker2));
        Player player2 = new Player(Arrays.asList(poker3,poker4));

        Player result = PokerCompareUtil.comparePlayer(player1,player2);

        Assert.assertEquals(player2,result);

    }


    @Test
    public void should_return_pokers2_when_call_comparePlayer_given_24679_34789() {

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

        Player player1 = new Player(Arrays.asList(poker1,poker2,poker3,poker4,poker5));
        Player player2 = new Player(Arrays.asList(poker6,poker7,poker8,poker9,poker10));

        Player result = PokerCompareUtil.comparePlayer(player1,player2);

        Assert.assertEquals(player2,result);

    }

    @Test
    public void should_return_player2_when_call_comparePlayer_given_T42QJ_K4GJ3(){

        Poker poker1 = new Poker('T', 'H');
        Poker poker2 = new Poker('4', 'D');
        Poker poker3 = new Poker('2', 'H');
        Poker poker4 = new Poker('Q', 'S');
        Poker poker5 = new Poker('J', 'S');

        Poker poker6 = new Poker('K', 'S');
        Poker poker7 = new Poker('4', 'D');
        Poker poker8 = new Poker('G', 'S');
        Poker poker9 = new Poker('J', 'C');
        Poker poker10 = new Poker('3', 'C');

        Player player1 = new Player(Arrays.asList(poker1,poker2,poker3,poker4,poker5));
        Player player2 = new Player(Arrays.asList(poker6,poker7,poker8,poker9,poker10));

        Player result = PokerCompareUtil.comparePlayer(player1,player2);

        Assert.assertEquals(player2,result);

    }

    @Test
    public void should_return_player2_when_call_comparePlayer_given_23k95_4423Q(){

        Poker poker1 = new Poker('2', 'H');
        Poker poker2 = new Poker('3', 'D');
        Poker poker3 = new Poker('K', 'H');
        Poker poker4 = new Poker('9', 'S');
        Poker poker5 = new Poker('5', 'S');

        Poker poker6 = new Poker('4', 'S');
        Poker poker7 = new Poker('4', 'D');
        Poker poker8 = new Poker('2', 'S');
        Poker poker9 = new Poker('3', 'C');
        Poker poker10 = new Poker('Q', 'C');

        Player player1 = new Player(Arrays.asList(poker1,poker2,poker3,poker4,poker5));
        Player player2 = new Player(Arrays.asList(poker6,poker7,poker8,poker9,poker10));

        Player result = PokerCompareUtil.comparePlayer(player1,player2);

        Assert.assertEquals(player2,result);

    }



    @Test
    public void should_return_player1_when_call_comparePlayer_given_97884_8977T(){

        Poker poker1 = new Poker('9', 'H');
        Poker poker2 = new Poker('7', 'D');
        Poker poker3 = new Poker('8', 'H');
        Poker poker4 = new Poker('8', 'S');
        Poker poker5 = new Poker('4', 'S');

        Poker poker6 = new Poker('8', 'S');
        Poker poker7 = new Poker('9', 'D');
        Poker poker8 = new Poker('7', 'S');
        Poker poker9 = new Poker('7', 'C');
        Poker poker10 = new Poker('T', 'C');

        Player player1 = new Player(Arrays.asList(poker1,poker2,poker3,poker4,poker5));
        Player player2 = new Player(Arrays.asList(poker6,poker7,poker8,poker9,poker10));

        Player result = PokerCompareUtil.comparePlayer(player1,player2);

        Assert.assertEquals(player1,result);

    }

    @Test
    public void should_return_player2_when_call_comparePlayer_given_8789J_8689Q(){

        Poker poker1 = new Poker('8', 'H');
        Poker poker2 = new Poker('7', 'D');
        Poker poker3 = new Poker('8', 'H');
        Poker poker4 = new Poker('9', 'S');
        Poker poker5 = new Poker('J', 'S');

        Poker poker6 = new Poker('8', 'S');
        Poker poker7 = new Poker('6', 'D');
        Poker poker8 = new Poker('8', 'S');
        Poker poker9 = new Poker('9', 'C');
        Poker poker10 = new Poker('Q', 'C');

        Player player1 = new Player(Arrays.asList(poker1,poker2,poker3,poker4,poker5));
        Player player2 = new Player(Arrays.asList(poker6,poker7,poker8,poker9,poker10));

        Player result = PokerCompareUtil.comparePlayer(player1,player2);

        Assert.assertEquals(player2,result);

    }

    @Test
    public void should_return_player2_when_call_comparePlayer_given_8789J_86778(){

        Poker poker1 = new Poker('8', 'H');
        Poker poker2 = new Poker('7', 'D');
        Poker poker3 = new Poker('8', 'H');
        Poker poker4 = new Poker('9', 'S');
        Poker poker5 = new Poker('J', 'S');

        Poker poker6 = new Poker('8', 'S');
        Poker poker7 = new Poker('6', 'D');
        Poker poker8 = new Poker('7', 'S');
        Poker poker9 = new Poker('7', 'C');
        Poker poker10 = new Poker('8', 'C');

        Player player1 = new Player(Arrays.asList(poker1,poker2,poker3,poker4,poker5));
        Player player2 = new Player(Arrays.asList(poker6,poker7,poker8,poker9,poker10));

        Player result = PokerCompareUtil.comparePlayer(player1,player2);

        Assert.assertEquals(player2,result);

    }


    @Test
    public void should_return_player1_when_call_comparePlayer_given_87899_86778(){

        Poker poker1 = new Poker('8', 'H');
        Poker poker2 = new Poker('7', 'D');
        Poker poker3 = new Poker('8', 'H');
        Poker poker4 = new Poker('9', 'S');
        Poker poker5 = new Poker('9', 'S');

        Poker poker6 = new Poker('8', 'S');
        Poker poker7 = new Poker('6', 'D');
        Poker poker8 = new Poker('7', 'S');
        Poker poker9 = new Poker('7', 'C');
        Poker poker10 = new Poker('8', 'C');

        Player player1 = new Player(Arrays.asList(poker1,poker2,poker3,poker4,poker5));
        Player player2 = new Player(Arrays.asList(poker6,poker7,poker8,poker9,poker10));

        Player result = PokerCompareUtil.comparePlayer(player1,player2);

        Assert.assertEquals(player1,result);

    }

    @Test
    public void should_return_player2_when_call_comparePlayer_given_87897_8T778(){

        Poker poker1 = new Poker('8', 'H');
        Poker poker2 = new Poker('7', 'D');
        Poker poker3 = new Poker('8', 'H');
        Poker poker4 = new Poker('9', 'S');
        Poker poker5 = new Poker('7', 'S');

        Poker poker6 = new Poker('8', 'S');
        Poker poker7 = new Poker('T', 'D');
        Poker poker8 = new Poker('7', 'S');
        Poker poker9 = new Poker('7', 'C');
        Poker poker10 = new Poker('8', 'C');

        Player player1 = new Player(Arrays.asList(poker1,poker2,poker3,poker4,poker5));
        Player player2 = new Player(Arrays.asList(poker6,poker7,poker8,poker9,poker10));

        Player result = PokerCompareUtil.comparePlayer(player1,player2);

        Assert.assertEquals(player2,result);

    }

    @Test
    public void should_return_player2_when_call_comparePlayer_given_87899_7T778(){

        Poker poker1 = new Poker('8', 'H');
        Poker poker2 = new Poker('7', 'D');
        Poker poker3 = new Poker('8', 'H');
        Poker poker4 = new Poker('9', 'S');
        Poker poker5 = new Poker('9', 'S');

        Poker poker6 = new Poker('7', 'S');
        Poker poker7 = new Poker('T', 'D');
        Poker poker8 = new Poker('7', 'S');
        Poker poker9 = new Poker('7', 'C');
        Poker poker10 = new Poker('8', 'C');

        Player player1 = new Player(Arrays.asList(poker1,poker2,poker3,poker4,poker5));
        Player player2 = new Player(Arrays.asList(poker6,poker7,poker8,poker9,poker10));

        Player result = PokerCompareUtil.comparePlayer(player1,player2);

        Assert.assertEquals(player2,result);

    }

    @Test
    public void should_return_player1_when_call_comparePlayer_given_87898_7T778(){

        Poker poker1 = new Poker('8', 'H');
        Poker poker2 = new Poker('7', 'D');
        Poker poker3 = new Poker('8', 'H');
        Poker poker4 = new Poker('9', 'S');
        Poker poker5 = new Poker('8', 'S');

        Poker poker6 = new Poker('7', 'S');
        Poker poker7 = new Poker('T', 'D');
        Poker poker8 = new Poker('7', 'S');
        Poker poker9 = new Poker('7', 'C');
        Poker poker10 = new Poker('8', 'C');

        Player player1 = new Player(Arrays.asList(poker1,poker2,poker3,poker4,poker5));
        Player player2 = new Player(Arrays.asList(poker6,poker7,poker8,poker9,poker10));

        Player result = PokerCompareUtil.comparePlayer(player1,player2);

        Assert.assertEquals(player1,result);

    }


    @Test
    public void should_return_player2_when_call_comparePlayer_given_87898_46537(){

        Poker poker1 = new Poker('8', 'H');
        Poker poker2 = new Poker('7', 'D');
        Poker poker3 = new Poker('8', 'H');
        Poker poker4 = new Poker('9', 'S');
        Poker poker5 = new Poker('8', 'S');

        Poker poker6 = new Poker('4', 'S');
        Poker poker7 = new Poker('6', 'D');
        Poker poker8 = new Poker('5', 'S');
        Poker poker9 = new Poker('3', 'C');
        Poker poker10 = new Poker('7', 'C');

        Player player1 = new Player(Arrays.asList(poker1,poker2,poker3,poker4,poker5));
        Player player2 = new Player(Arrays.asList(poker6,poker7,poker8,poker9,poker10));

        Player result = PokerCompareUtil.comparePlayer(player1,player2);

        Assert.assertEquals(player2,result);

    }

    @Test
    public void should_return_player2_when_call_comparePlayer_given_87564_46537(){

        Poker poker1 = new Poker('8', 'H');
        Poker poker2 = new Poker('7', 'D');
        Poker poker3 = new Poker('5', 'H');
        Poker poker4 = new Poker('6', 'S');
        Poker poker5 = new Poker('4', 'S');

        Poker poker6 = new Poker('4', 'S');
        Poker poker7 = new Poker('6', 'D');
        Poker poker8 = new Poker('5', 'S');
        Poker poker9 = new Poker('3', 'C');
        Poker poker10 = new Poker('7', 'C');

        Player player1 = new Player(Arrays.asList(poker1,poker2,poker3,poker4,poker5));
        Player player2 = new Player(Arrays.asList(poker6,poker7,poker8,poker9,poker10));

        Player result = PokerCompareUtil.comparePlayer(player1,player2);

        Assert.assertEquals(player1,result);

    }




}