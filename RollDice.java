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
