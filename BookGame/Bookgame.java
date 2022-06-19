import java.util.Random;
import java.util.*;
public class Bookgame{
    public static void main(String[] args){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int score1=0,score2=0;
        System.out.println("Enter 1 To Start The Game and 0 for exit:  ");
        int start=sc.nextInt();
        if(start==1) {
            System.out.println("enter the name of player1: ");
            String p1 = sc.next();
            System.out.println("enter the name of player2: ");
            String p2 = sc.next();
            System.out.println("Player " + p1);
            int pageNum = 0;
            int point1 = 0;
            int count1 = 0;
            while (true) {
                System.out.println("Press 1 to Enter Open Book");
                int key = sc.nextInt();
                if (key == 1) {
                    pageNum = random.nextInt(300);
                } else {
                    System.out.println("Game is terminated Exitt!!!");
                }
                point1 = (pageNum + 1) % 7;
                score1 = point1 + score1;
                count1++;
                System.out.println("Page Number " + (++pageNum) + " Point " + point1 + " Score " + score1);
                if (point1 == 0)
                    break;
                else {
                    continue;
                }
            }
            System.out.println(p1 + " completes in " + count1 + " rounds");
            System.out.println("score of player 1 is : " + score1);
            System.out.println(p2 + " needs " + (score1 + 1) + " in " + count1 + " rounds");
            System.out.println("player " + p2);
            int point2 = 0;
            int count2 = 0;
            while (true) {
                System.out.println("Press 1 to Enter Open Book");
                int key = sc.nextInt();
                if (key == 1) {
                    pageNum = random.nextInt(300);
                } else {
                    System.out.println("Game is terminated Exitt!!!");
                }
                point2 = (pageNum + 1) % 7;
                score2 = point2 + score2;
                count2++;
                System.out.println("Page Number " + (++pageNum) + " Point " + point2 + " Score " + score2);
                if (point2 == 0 || score2 >= score1)
                    break;
                else {
                    continue;
                }
            }
            System.out.println(p2 + " completes in " + count2 + " rounds");
            System.out.println("score of player 2 is : " + score2);
            if (score2 > score1 && count2 <= count1) {
                System.out.println(p2 + " wins the game");
            } else {
                System.out.println(p1 + " wins the game");
            }
        }else{
            System.out.println("EXIT");
        }
    }
}
