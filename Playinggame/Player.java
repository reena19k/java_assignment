package com.aurionpro.model;
import java.util.Scanner;
public class Player {
    private String name;
    private int num;
    private int turn = 1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    Scanner sc = new Scanner(System.in);

    public void playGuessGame(int random_num) {
        System.out.println("Guess the number :");
        int num = sc.nextInt();
        checkRange(random_num, num);
        if(getTurn()>6 && getTurn()!=10){
            System.out.println("OOps you could not guess it Game Over And the No. is"  +random_num);
        }
    }

    public void checkRange(int user_num, int random_num) {
        if (user_num - random_num > 0) {
            System.out.println("Too low");
            setTurn(getTurn() + 1);
        } else if (user_num - random_num < 0) {
            System.out.println("Too high");
            setTurn(getTurn() + 1);
        } else {
            System.out.println("You guessed it right the number is " + random_num);
            setTurn(10);
        }
    }
}