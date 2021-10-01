NY-NY-NY 
import java.util.Scanner;

public class Jam {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Slå terningerne, den der har flest point når de når 40+, VINDER. Held og Lykke!");
        int Spiller1, Spiller2;
        Spiller1 = 0;
        Spiller2 = 0;
        int Die1, Die2, Die3, Die4;
        int sum1, sum2;
        int runde = 1;

        while (Spiller1 < 40 && Spiller2 < 40) {
            Die1 = (int) (Math.random() * 6) + 1;
            Die2 = (int) (Math.random() * 6) + 1;
            Die3 = (int) (Math.random() * 6) + 1;
            Die4 = (int) (Math.random() * 6) + 1;
            sum1 = (Die1 + Die2);
            sum2 = (Die3 + Die4);

            Spiller1 += sum1;
            Spiller2 += sum2;

            System.out.println("------------Runde " + runde + "-------------");
            runde++;

            System.out.println("Spiller1 får i sine 2 kast en samlet værdi på: " + sum1);
            System.out.println("Spiller2 får i sine 2 kast en samlet værdi på: " + sum2);

            if (sum1 > sum2) {
                System.out.println(sum1 + " Er større end " + sum2 + " og derfor vinder spiller1 denne runde. Spiller1 har nu " + Spiller1 + " point, mens Spiller2 har " + Spiller2 + " point");
            } else if (sum2 > sum1) {
                System.out.println(sum2 + " Er større end " + sum1 + " og derfor vinder spiller2 denne runde. Spiller 1 har nu " + Spiller1 + " point, mens Spiller2 har " + Spiller2 + " point");
            } else if (sum1 == sum2) {
                System.out.println(sum1 + " Er lig med " + sum2 + ", og denne runde bliver altså til et uafgjort, nu har Spiller1 " + Spiller1 + " point, mens Spiller2 har " + Spiller2 + " point");
            }

        }
        if (Spiller1 >= 40 || Spiller2 >= 40) {
            if (Spiller1 == Spiller2) {
                System.out.println("DET BLIVER TIL ET UAFGJORT!");
            } else if (Spiller1 > Spiller2) {
                System.out.println("SPILLER 1 ER VINDEREN!");
            } else if (Spiller2 > Spiller1) {
                System.out.println("SPILLER 2 ER VINDEREN!");
            }
        }
    }
}












1000 gange test



public class Test {
    public static void main(String[] args) {
        int Terning1 = 0;
        int Terning2 = 0;
        int Terning3 = 0;
        int Terning4 = 0;
        int Terning5 = 0;
        int Terning6 = 0;
        for (int i = 0; i <= 1000; i++) {
            int Die1 = (int) (Math.random() * 6) + 1;
            if (Die1 == 1) {
                System.out.println(Terning1++);
            }
            if (Die1 == 2) {
                System.out.println(Terning2++);
            }
            if (Die1 == 3) {
                System.out.println(Terning3++);
            }
            if (Die1 == 4) {
                System.out.println(Terning4++);
            }
            if (Die1 == 5) {
                System.out.println(Terning5++);
            }
            if (Die1 == 6) {
                System.out.println(Terning6++);
            }
        }
    }
}

