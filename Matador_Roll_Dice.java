import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Matador_Roll_Dice {

    public static void main (String[] args) {

        int num_Spillere;
        Scanner sc = new Scanner (System.in);
        ArrayList<String> Spillere = new ArrayList(); //ArrayList i Java bruges til at gemme samling af elementer i dynamisk størrelse.
        // I modsætning til arrays, der er faste i størrelse, vokser en ArrayList sin størrelse automatisk, når nye
        // elementer tilføjes til den.

        do {
            System.out.println("Hvor mange spillere?");
            num_Spillere = sc.nextInt();
    } while (num_Spillere < 1 || num_Spillere > 2); //Vi opretter en loop, der markerer spillernes navne og tilføjer
        // derefter disse navne til ArrayList.
        for (int i = 0; i < num_Spillere; i++) {
            System.out.print("Skriv spillers " + (i + 1) + "'s navn: ");
            Spillere.add(sc.next());
}

    }
}

