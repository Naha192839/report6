package jp.ac.uryukyu.ie.e185701;

import java.util.Random;
import java.util.Scanner;
public class Player1 {
    private int rock = 0;
    private int scissors = 1;
    private int peper = 2;

    private String hand1;

    private int pon1;
    public void player1(){
        String input; //読み込んだユーザ入力を格納するStringオブジェクトを用意。
        Scanner in = new Scanner(System.in);// 標準入力から読み込むスキャナを用意
        input = in.nextLine(); // inputにユーザ入力を保存する


        if (input.equals("ぐう")){
            hand1 = "ぐう";
            pon1 = rock;
        }
        else if (input.equals("ちょき")){
            hand1 = "ちょき";
            pon1 = scissors;
        }
        else if (input.equals("ぱあ")){
            hand1 = "ぱあ";
            pon1 = peper;
        }
        else {
            pon1 = -1;
        }
    }
    public int getRock() {
        return rock;
    }

    public void setRock(int rock) {
        this.rock = rock;
    }

    public int getScissors() {
        return scissors;
    }

    public void setScissors(int scissors) {
        this.scissors = scissors;
    }

    public int getPeper() {
        return peper;
    }

    public void setPeper(int peper) {
        this.peper = peper;
    }

    public int getPon1() {
        return pon1;
    }

    public void setPon1(int pon1) {
        this.pon1 = pon1;
    }

    public String getHand1() {
        return hand1;
    }

    public void setHand1(String hand1) {
        this.hand1 = hand1;
    }
}
