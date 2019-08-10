package com.thoughtworks.tdd;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/8/9
 * @Time:14:51
 * @description:
 */
public class Poker {

    private char num;
    private char color;

    public Poker(char num, char color) {
        this.num = num;
        this.color = color;
    }

    public char getNum() {
        return num;
    }

    public void setNum(char num) {
        this.num = num;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object object) {

        Poker poker = (Poker)object;

        return this.num == poker.num;

    }

}