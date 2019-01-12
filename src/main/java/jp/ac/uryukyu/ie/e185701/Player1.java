package jp.ac.uryukyu.ie.e185701;

import java.util.Random;
import java.util.Scanner;
public class Player1 {
    int rock = 0;
    int scissors = 1;
    int peper = 2;

    String hand1;

    int pon1;
    public void player1(){
        String input; //読み込んだユーザ入力を格納するStringオブジェクトを用意。
        Scanner in = new Scanner(System.in);// 標準入力から読み込むスキャナを用意
        input = in.nextLine(); // inputにユーザ入力を保存する

        //Random random = new Random();
        //int choice = random.nextInt(3);
     //   System.out.println(choice);
        if (input.equals("ぐう")==true){
            hand1 = "ぐう";
            pon1 = 0;
        }
        else if (input.equals("ちょき")==true){
            hand1 = "ちょき";
            pon1 = 1;
        }
        else if (input.equals("ぱあ")==true){
            hand1 = "ぱあ";
            pon1 = 2;
        }
    }
}
