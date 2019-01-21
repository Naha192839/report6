package jp.ac.uryukyu.ie.e185701;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Player2Test {

    @Test
    void random() {
        int[] test ={0,1,2};
        Player2 p2 = new Player2();
        p2.random();
        for (int i:test) {
            if (p2.choice ==test[i]){
                System.out.println(p2.choice);
            }
        }
        System.out.println(p2.choice);
    }
}