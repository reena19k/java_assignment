package com.aurionpro.test;
import com.aurionpro.model.*;
import java.util.Random;
import java.util.Scanner;
public class PlayerTest {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Player player = new Player();
        Random r1 = new Random();
        int guessNum = r1.nextInt(100);
        System.out.println("Welcome to guess Game ");
        System.out.println("Enter your name: ");
        player.setName(sc.next());
        System.out.println(player.getName()+" play now");
        while (player.getTurn() < 7)
        player.playGuessGame(guessNum);


    }
}