import java.util.*;
public class hello {


        public static void main(String[] args){
            int spiller1, spiller2;
            int dice, dice1, dice2;
            spiller1 = 1000;
            spiller2 = 1000;
            int score = 3000;
            Scanner player = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter first player name");

            String playerName1 = player.nextLine();  // Read user input
            System.out.println("Username is: " + playerName1);  // Output user input
            System.out.println("Enter second player name");
            String playerName2 = player.nextLine();  // Read user input
            System.out.println("Username is: " + playerName2);
            for (int i = 1000; i < 3000; i++) {
                spiller1 = spiller1 + i;
                if (spiller1 == 3000) {
                    dice1 = (int) (Math.random() * 6) + 1;
                    dice2 = (int) (Math.random() * 6) + 1;
                    dice = dice1 + dice2;
                    dice++;

                    if (dice == 2) {
                        System.out.println(spiller1 + 250);
                        System.out.println(spiller2 + 250);
                        spiller1++;
                    }

                    if (dice == 3) {

                        System.out.println(spiller1 - 100);
                        System.out.println(spiller2 - 100);
                        spiller1++;
                    }

                    if (dice == 4) {

                        System.out.println(spiller1 + 100);
                        System.out.println(spiller2 + 100);
                        spiller1++;
                    }

                    if (dice == 5) {

                        System.out.println(spiller1 - 20);
                        System.out.println(spiller2 - 20);
                        spiller1++;
                    }

                    if (dice == 6) {

                        System.out.println(spiller1 + 180);
                        System.out.println(spiller2 + 180);
                        spiller1++;
                    }

                    if (dice == 7) {

                        System.out.println(spiller1);
                        System.out.println(spiller2);
                        spiller1++;
                    }

                    if (dice == 8) {

                        System.out.println(spiller1 - 70);
                        System.out.println(spiller2 - 70);
                        spiller1++;
                    }

                    if (dice == 9) {

                        System.out.println(spiller1 + 60);
                        System.out.println(spiller2 + 60);
                        spiller1++;
                    }

                    if (dice == 10) {

                        System.out.println(spiller1 - 80); // husk at spilleren skal have en ekstra tur
                        System.out.println(spiller2 - 80);
                        spiller1++;
                    }

                    if (dice == 11) {

                        System.out.println(spiller1 - 50);
                        System.out.println(spiller2 - 50);
                        spiller1++;

}

                    if (dice == 12) {

                            System.out.println(spiller1 + 650);
                            System.out.println(spiller2 + 650);
                            spiller1++;
                            }

                            }
                            }

                            }
    }
