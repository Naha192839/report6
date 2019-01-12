package jp.ac.uryukyu.ie.e185701;

import java.util.Random;

public class Player2 {
        int rock = 0;
        int scissors = 1;
        int peper = 2;

        String hand2;
        int pon2;
        public void player2(){
            Random random = new Random();
            int choice = random.nextInt(3);
            //System.out.println(choice);
            if (choice == 0){
                hand2 = "ぐう";
                pon2 = 0;
            }
            if (choice == 1){
                hand2 = "ちょき";
                pon2 = 1;
            }
            if (choice == 2){
                hand2 = "ぱあ";
                pon2 = 2;
            }
        }
}

