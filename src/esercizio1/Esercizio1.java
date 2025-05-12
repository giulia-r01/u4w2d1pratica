package esercizio1;

import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        int[] numeri = new int[5];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = random.nextInt(10)+1;
        }

        System.out.println("Array iniziale");
        for (int i = 0; i < numeri.length; i++) {
            System.out.println(numeri[i] + " ");
        }

        System.out.println();

        while (true){
            try {
                System.out.println("Inserisci la posizione (da 0 a 4) da modificare: (digita 5 per terminare)");
                int posizione = scanner.nextInt();

                if (posizione == 5) {
                    System.out.println("Programma terminato");
                    break;
                }

                System.out.println("Inserisci il nuovo valore (digita 0 per terminare): ");
                int nuovoValore = scanner.nextInt();

                if (nuovoValore == 0) {
                    System.out.println("Programma terminato");
                    break;
                }
                numeri[posizione] = nuovoValore;

                System.out.println("Array aggiornato");
                for (int i = 0; i < numeri.length; i++) {
                    System.out.println(numeri[i] + " ");
                }
                System.out.println();

            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Errore: hai scelto una posizione che va oltre il limite (da 0 a 4)");
            }
            catch (Exception e){
                System.out.println("Errore di input. Assicurati di inserire numeri interi");
                scanner.nextLine();
            }


        }

        scanner.close();


    }

}