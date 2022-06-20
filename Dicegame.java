package com.aurionpro.test;
import java.util.Scanner;
import java.util.Random;
public class Dicegame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random= new Random();
        System.out.println("Welcome to dice game");
        int turn=1;
        int score=0;
        int Die=0;

        while (score<=20)
        {
            System.out.println(" TURN "+turn);
            System.out.println("Roll or Hold?(r/h): ");
            char key=sc.next().charAt(0);
            if(key=='r')
            {
                Die=1+random.nextInt(6);
                System.out.println("Die "+Die);
                if(Die==1)
                {
                    System.out.println("Turn Over. NO score");
                    turn++;
                    continue;
                }else
                {
                    score = score + Die;
                }
            }
            else if(key=='h')
            {
                System.out.println("Scores for turn "+turn+ " is "+score);
                turn++;
            }
         }
        System.out.println("You finished in "+turn+ " turns score is "+score);
    }
}