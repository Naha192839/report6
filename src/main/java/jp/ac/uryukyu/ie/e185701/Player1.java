package jp.ac.uryukyu.ie.e185701;

import java.util.Random;
import java.util.Scanner;

/**
 * playerのじゃんけんクラス
 */
public class Player1 {
       /**
     * ぐう、ちょき、ぱあの変数
     */
    private int rock = 0;
    private int scissors = 1;
    private int paper = 2;

    private int pon1;

    /**
     * playerの入力をぐう、ちょき、ぱあのどれか判断するメソッド。
     */
    public void player1() {
        String input; //読み込んだユーザ入力を格納するStringオブジェクトを用意。
        Scanner in = new Scanner(System.in);// 標準入力から読み込むスキャナを用意
        input = in.nextLine(); // inputにユーザ入力を保存する

        switch (input) {
            case "ぐう":
                pon1 = rock;
                break;
            case "ちょき":
                pon1 = scissors;
                break;
            case "ぱあ":
                pon1 = paper;
                break;
            default:
                pon1 = -1;
        }
    }
    /**
     * rockを取得します。
     * @return
     */
    public int getRock() {
        return rock;
    }

    /**
     * rockを設定します。
     * @param rock ぐう
     */
    public void setRock(int rock) {
        this.rock = rock;
    }
    /**
     * scissorsを取得します。
     * @return
     */
    public int getScissors() {
        return scissors;
    }
    /**
     *  scissorsを設定します。
     * @param  scissors　ちょき
     */
    public void setScissors(int scissors) {
        this.scissors = scissors;
    }
    /**
     * peparを取得します。
     * @return
     */
    public int getPaper() {
        return paper;
    }
    /**
     * peperを設定します。
     * @param paper　ぱあ
     */
    public void setPaper(int paper) {
        this.paper = paper;
    }

    /**
     * pon1を取得します。
      * @return
     */
    public int getPon1() {
        return pon1;
    }

    /**
     * pon1を設定します。
     * @param pon1　rock,scissors,paper:(0,1,2)のどれか１つ
     */
    public void setPon1(int pon1) {
        this.pon1 = pon1;
    }
}