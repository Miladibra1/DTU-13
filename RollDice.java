
public class RollDice {
    public static void main(String[] args) {

        int playerA[] = new int[50];
        int playerB[] = new int[50];
        int playerAScore = 0;
        int playerBScore = 0;
        int round = 1;
        for (int i =0; i < playerA.length; i++) {
            System.out.println("Roll the dice for round " + round++);
            playerA[i] = (int) ((Math.random() * 6) + 1);
            playerB[i] = (int) ((Math.random() * 6) + 1);

            System.out.println("player A has " + playerA[i] + " and player B has " + playerB[i]);

            if(playerA[i] == playerB[i]) {
                playerAScore = playerAScore + 3;
                playerBScore = playerBScore + 3;
            }
            else if (playerA[i] > playerB[i]) {
                playerAScore = playerAScore + 5;
            }
            else if (playerB[i] > playerA[i]) {
                playerBScore = playerBScore + 5;
            }
            if(playerAScore >= 40 || playerBScore >= 40) {
                break;
            }
        }

        System.out.println("The game is over.");

        if(playerAScore >= playerBScore)
            System.out.println("The winner is player A");
        else
            System.out.println("The winner is player B");

        System.out.println("How many rounds of game played?");
        System.out.println("Rounds played: " + round);

        System.out.println("Total Score per player:");
        System.out.println("Player A score: " + playerAScore);
        System.out.println("Player B score: " + playerBScore);

    }
}



NY-NY-NY-NY-NY-NY-NY-NY-NY

import java.util.Scanner;


public class CDIO_1ny {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Slå terningerne");
        int player1, player2;
        player1 = 0;
        player2 = 0;
        int Die1, Die2, Die3, Die4;
        Die1 = (int) (Math.random() * 6) + 1;
        Die2 = (int) (Math.random() * 6) + 1;
        Die3 = (int) (Math.random() * 6) + 1;
        Die4 = (int) (Math.random() * 6) + 1;
        int sum1, sum2;
        sum1 = (player1 + (Die1 + Die2));
        sum2 = (player2 + (Die3 + Die4));
        System.out.println("Spiller1 får i sine 2 kast en samlet værdi på: " + sum1 + ", Spiller2 får i sine 2 kast en samlet værdi på: " + sum2);
        while (true) {
            if (sum1 > sum2) {
                System.out.println(sum1 + " Er større end " + sum2 + " Derfor vinder Spiller1 denne runde");
            } else if (sum2 > sum1) {
                System.out.println(sum1 + " Er mindre end " + sum2 + " Derfor vinder Spiller2 denne runde");
            } else if (sum1 == sum2) {
                System.out.println(sum1 + " Er lig med " + sum2 + " Derfor bliver denne runde uafgjort");
            }
            if (sum1 >= 40 || sum2 >= 40) {
                System.out.println("The game is over");
            } break;
        }
    }
}

Hello
        import java.util.Scanner;

public class CDIO_1ny{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Slå terningerne");
        int player1, player2;
        player1 = 0;
        player2 = 0;

        int Die1, Die2, Die3, Die4;
        do {
            Die1 = (int) (Math.random() * 6) + 1;
            Die2 = (int) (Math.random() * 6) + 1;
            Die3 = (int) (Math.random() * 6) + 1;
            Die4 = (int) (Math.random() * 6) + 1;

            int sum1, sum2;
            sum1 = Die1 + Die2;
            sum2 = Die3 + Die4;

            player1 += sum1;
            player2 += sum2;

            System.out.println("Spiller1 får i sine 2 kast en samlet værdi på: " + sum1);
            System.out.println("Spiller2 får i sine 2 kast en samlet værdi på: " + sum2);

            if (sum1 > sum2) {
                System.out.println(sum1 + " Er større end " + sum2 + " Derfor vinder Spiller1 denne runde");
            }
            if (sum2 > sum1) {
                System.out.println(sum1 + " Er mindre end " + sum2 + " Derfor vinder Spiller2 denne runde");
            }
            if (sum1 == sum2) {
                System.out.println(sum1 + " Er lig med " + sum2 + " Derfor bliver denne runde uafgjort");
            }

            if (player1 >= 40) {
                System.out.println("The game is over player 1 won " + player1);
                break;
            }
            if (player2 >= 40) {

                System.out.println("The game is over player 2 won " + player2);
                break;
            }

        } while (player1 <= 50 || player2 <= 50);

    }

}



import java.util.Scanner;
import java.util.SortedMap;

public class RollADice {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Slå terningerne");
        int player1Score, player2Score;
        player1Score = 0;
        player2Score = 0;
        int sum1, sum2;

        int Die1, Die2, Die3, Die4;
        int runde = 1;

        //player1Score = player1Score + Die1 + Die2;
        while (true) {
            Die1 = (int) (Math.random() * 6) + 1;
            Die2 = (int) (Math.random() * 6) + 1;
            Die3 = (int) (Math.random() * 6) + 1;
            Die4 = (int) (Math.random() * 6) + 1;
            sum1 = (player1Score + (Die1 + Die2));
            sum2 = (player2Score + (Die3 + Die4));
            System.out.println("Spiller1 får i sine 2 kast en samlet værdi på: " + sum1 + ", Spiller2 får i sine 2 kast en samlet værdi på: " + sum2);

            player1Score = sum1;
            player2Score = sum2;

            System.out.println("-----------Runde "+runde+"----------------");
            runde++;

            if (sum1 > sum2) {
                System.out.println(sum1 + " Er større end " + sum2 + " Derfor vinder Spiller1 denne runde");
            } else if (sum2 > sum1) {
                System.out.println(sum1 + " Er mindre end " + sum2 + " Derfor vinder Spiller2 denne runde");
            } else if (sum1 == sum2) {
                System.out.println(sum1 + " Er lig med " + sum2 + " Derfor bliver denne runde uafgjort");
            }
            if (sum1 >= 40 || sum2 >= 40) {
                if (sum1 >= 40) {
                    System.out.println("spiller1 har vundet");
                }
                else if (sum2 >= 40){
                    System.out.println("spiller2 har vundet");
                }
                System.out.println("The game is over");
                break;
            }
        }
    }

}




