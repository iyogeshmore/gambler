package com.bridgelab.workshop;

import java.util.Random;

public class GamblerSimulatation {

    public static void main(String[] args) {
        int stake = 100;
        int win = 0;
        int loss = 0;
        final int goal = 200;

        System.out.println("Let's Gamble");


        {
            while (stake >= 1) {
                Random random = new Random();
                int int_random = random.nextInt(2);
                if (int_random < 1) { //Win = 0
                    stake++;
                    win++;
                } //win
                else { //Loss=1
                    stake--;
                    loss++;
                } //loss
                if (stake == goal) {
                    break;
                }
            }
        }
        System.out.println("Total Wins = " + win);
        System.out.println("Total Losses = " + loss);
        if (stake < 1) {
            System.out.println("You Loss...!!!");
        } else {
            System.out.println("you Won...!!!");
        }
    }
}