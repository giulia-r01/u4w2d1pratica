package Esercizio2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Inserisci i km percorsi (cifra intera): ");
            int km = scanner.nextInt();

            System.out.println("Inserisci il numero intero dei litri di carburante consumati: ");
            int lt = scanner.nextInt();

            int consumo = km/lt;
            System.out.println("Consumo (km/litro) = " + consumo);
        }
        catch (ArithmeticException e){
            System.out.println("Errore: non puoi dividere per 0. I litri devono essere > di 0");
        }
        catch (Exception e){
            System.out.println("Errore: Assicurati di inserire numeri interi");
        }

//        In Java, la divisione int / 0 lancia un'eccezione ArithmeticException automaticamente.
//        Ma con i double, NON viene generata eccezione, anche se dividi per zero.

        try {
            System.out.println("Inserisci i km percorsi (cifra decimale): ");
            double km = scanner.nextDouble();

            System.out.println("Inserisci il numero decimale dei litri di carburante consumati: ");
            double lt = scanner.nextDouble();

            if (lt == 0) {
                throw new ArithmeticException("Divisione per zero");
            }

            double consumo = km/lt;
            System.out.println("Consumo (km/litro) = " + consumo);
        }
        catch (ArithmeticException e){
            System.out.println("Errore: i litri non possono essere 0");
        }
        catch (Exception e){
            System.out.println("Errore: Assicurati di inserire numeri decimali");
        }


        scanner.close();

    }
}
