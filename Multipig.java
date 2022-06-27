package com.aurionpro.test;
import java.util.*;
import java.util.Random;
public class Multipig {

    public static void main(String[] args) {
        System.out.println("PIG DICE GAME");
        System.out.println("* See how many turns it takes you to get to 20");
        System.out.println("* Turn ends when you hold or roll a 1");
        System.out.println("* If you roll a 1, you lose all points for the turn");
        System.out.println("* If you hold, you save all points for the turn\n");

        int totalscore1 = 0, turns1 = 1, turnScore1 = 0;					
        Scanner sc = new Scanner(System.in);
        System.out.println("Player 1 turn");
        System.out.println("TURN " + turns1 );
        while (totalscore1 < 20) {
            System.out.print("Roll or hold? (r/h): ");
            char s = sc.next().charAt(0);
            int newScore1 = 0;
            if (s == 'r') {
                Random random = new Random();
                int die = 1 + random.nextInt(6);
                if (die != 1) {
                    System.out.println("Die: " + die);

                    turnScore1 = turnScore1 + die;
                    newScore1 = totalscore1 + turnScore1;
                    if (turnScore1 >= 20 || newScore1 >= 20) {
                        if (newScore1 >= 20) {
                            System.out.println("Total score: " + newScore1 + "\n");
                        } else {
                            System.out.println("Total score: " + turnScore1 + "\n");
                        }
                        System.out.println("You finished in " + turns1 + " turns!\n");
                        System.out.println("Game Over!");
                        break;
                    }
                } else {
                    turnScore1 = 0;
                    System.out.println("Die: " + die);
                    System.out.println("Turn Over, No Score.\n");
                    turns1++;
                    System.out.println("TURN " + turns1);
                }

            } else if (s == 'h') {
                totalscore1 = totalscore1 + turnScore1;
                if (totalscore1 >= 20) {
                    System.out.println("Total score: " + totalscore1 + "\n");
                    System.out.println("You finished in " + turns1 + " turns!\n");
                    System.out.println("Game Over!");
                    break;
                } else {
                    System.out.println("Score for turn " + turns1 + ": " + turnScore1);
                    System.out.println("Total Score: " + totalscore1 + "\n");
                    turns1++;
                    System.out.println("TURN " + turns1);
                    turnScore1 = 0;
                }
            } else {
                System.out.println("Enter r or h only");
            }
           }
            int totalscore2 = 0, turns2 = 1, turnScore2 = 0;

            System.out.println("Player 2 turn");
            System.out.println("TURN " + turns2 );
            while (totalscore2 < 20) {
                System.out.print("Roll or hold? (r/h): ");
                char s = sc.next().charAt(0);
                int newScore2 = 0;
                if (s == 'r') {
                    Random random = new Random();
                    int die = 1 + random.nextInt(6);
                    if (die != 1) {
                        System.out.println("Die: " + die);
                        turnScore2 = turnScore2 + die;
                        newScore2 = totalscore2 + turnScore2;
                        if (turnScore2 >= 20 || newScore2 >= 20) {
                            if (newScore2 >= 20) {
                                System.out.println("Total score: " + newScore2 + "\n");
                            } else {
                                System.out.println("Total score: " + turnScore2 + "\n");
                            }
                            System.out.println("You finished in " + turns2 + " turns!\n");
                            System.out.println("Game Over!");
                            break;
                        }
                    } else {
                        turnScore2 = 0;
                        System.out.println("Die: " + die);
                        System.out.println("Turn Over, No Score.\n");
                        turns2++;
                        System.out.println( "TURN " + turns2 );
                    }

                } else if (s == 'h') {
                    totalscore2 = totalscore2 + turnScore2;
                    if (totalscore2 >= 20) {
                        System.out.println("Total score: " + totalscore2 + "\n");
                        System.out.println("You finished in " + turns2 + " turns!\n");
                        System.out.println("Game Over!");
                        break;
                    } else {
                        System.out.println("Score for turn " + turns2 + ": " + turnScore2);
                        System.out.println("Total Score: " + totalscore2 + "\n");
                        turns2++;
                        System.out.println("TURN " + turns2);
                        turnScore2 = 0;
                    }
                }

                else
                {
                    System.out.println("Enter r or h only");
                }

            }
        Random random1 = new Random();
            if(turns1 > turns2)
            {
                System.out.println(" player 2 Wins the game ");
            }else if(turns1==turns2)
            {
                System.out.println("Player 1 one chance : ");
                int tie_die1 = 1 + random1.nextInt(6);
                System.out.println("Player 2 one chance : ");
                int tie_die2 = 1 + random1.nextInt(6);
                if (tie_die1 > tie_die2) 
                {
                    System.out.println("player 2 wins ");
                } else
                {
                    System.out.println("player 1 wins ");
                }
            } else
            	{
                    System.out.println("player 1 wins  the game");
                }
            }
            
    }

