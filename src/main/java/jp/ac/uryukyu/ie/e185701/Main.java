package jp.ac.uryukyu.ie.e185701;

public class Main {
    public static void main(String[] args){
        Player1 p1 =new Player1();
        Player2 p2 = new Player2();

       System.out.println("最初はぐう、じゃんけん");

        while (p1.getPon1()==p2.getPon2()){

        p1.player1();
        p2.player2();

        if (p1.getPon1() ==p1.getRock() && p2.getPon2()==p2.getScissors()){
            System.out.println("Payer2は"+p2.getHand2()+"を出した");
            System.out.println("Payer1は勝利した");
        }

        else if (p1.getPon1() ==p1.getScissors() && p2.getPon2()==p2.getPeper()){
            System.out.println("Payer2は"+p2.getHand2()+"を出した");
            System.out.println("Payer1は勝利した");
        }

        else if (p1.getPon1() ==p1.getPeper() && p2.getPon2()==p2.getRock()){
            System.out.println("Payer2は"+p2.getHand2()+"を出した");
            System.out.println("Payer1は勝利した");
        }

        else if (p1.getPon1() == p2.getPon2()){
            System.out.println("Payer2は"+p2.getHand2()+"を出した");
            System.out.println("あいこ");
        }
        else if (p1.getPon1()==-1){
            System.out.println("るーるをまもろう");
        }

        else {
            System.out.println("Payer2は"+p2.getHand2()+"を出した");
            System.out.println("Payer2は勝利した");
        }
        }
    }
}
