package esercizio3;

import java.util.Scanner;

public class MainEsercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContoCorrente contoCorrente = new ContoCorrente("Anna Pannocchia", 2000);
        ContoOnLine contoOnLine = new ContoOnLine("Erbert Ballerina", 500, 300);

        int scelta;
        do {
            System.out.println("Scegli il conto da cui vuoi prelevare (1=ContoCorrente, 2=ContoOnLine)");
            scelta= scanner.nextInt();

            if (scelta == 1 || scelta == 2) {
                System.out.println("Inserisci l'importo da prelevare: ");
                double importoPrelievo = scanner.nextDouble();

                try {
                    if(scelta==1){
                        contoCorrente.preleva(importoPrelievo);
                    }else{
                        contoOnLine.preleva(importoPrelievo);
                    }

                    System.out.println("Prelievo effettuato con successo! Saldo attuale " + (scelta ==1 ? contoCorrente.getSaldo() : contoOnLine.getSaldo()));

                }
                catch (BancaExeption e){
                    System.out.println("Errore: " + e.getMessage());
                }
            }
        }while (scelta!=0);

        scanner.close();
    }
}
