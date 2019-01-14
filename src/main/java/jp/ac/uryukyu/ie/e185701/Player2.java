package jp.ac.uryukyu.ie.e185701;

import java.util.Random;

public class Player2 {
    private int rock = 0;
    private int scissors = 1;
    private int peper = 2;

    private String hand2;
    private int pon2;
    public void player2(){
        Random random = new Random();
        int choice = random.nextInt(3);

        if (choice == 0){
            hand2 = "ぐう";
            pon2 = rock;
        }
        if (choice == 1){
            hand2 = "ちょき";
            pon2 = scissors;
        }
        if (choice == 2){
            hand2 = "ぱあ";
            pon2 = peper;
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

    public int getPon2() {
        return pon2;
    }

    public void setPon2(int pon2) {
        this.pon2 = pon2;
    }

    public String getHand2() {
        return hand2;
    }

    public void setHand2(String hand2) {
        this.hand2 = hand2;
    }
}

