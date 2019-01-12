package jp.ac.uryukyu.ie.e185701;

public class Main {
    public static void main(String[] args){
        Player1 p1 =new Player1();
        Player2 p2 = new Player2();
        System.out.println("最初はぐう、じゃんけん");
        while (p1.pon1==p2.pon2){
        p1.player1();
        p2.player2();
        //System.out.println("Payer1は"+p1.+"を出した");
        System.out.println("Payer2は"+p2.hand2+"を出した");
        if (p1.pon1 ==0 && p2.pon2==1){
            System.out.println("Payer1は勝利した");
        }
        else if (p1.pon1 ==1 && p2.pon2==2){
            System.out.println("Payer1は勝利した");
        }
        else if (p1.pon1 ==2 && p2.pon2==0){
            System.out.println("Payer1は勝利した");
        }
        else if (p1.pon1 == p2.pon2){
            System.out.println("あいこ");
        }
        else {
            System.out.println("Payer2は勝利した");
        }
        }
    }
}
