package Esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class numeroRandom {
    private static final Logger logger = LoggerFactory.getLogger(numeroRandom.class);
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numRand = 0;
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            numRand = (int) (Math.random() * 10 + 1);
            array[i] = numRand;
            System.out.println(array[i]);
        }
    while(true){
        try{
            System.out.println("Inserisci un numero da 1 a 10 e premi invio: (inserisci -1 per uscire)");
            int num = scanner.nextInt();
            if( num == -1){
                System.out.println("Programma Terminato");
                break;
            }

            if (num < 1 || num > 10){
                throw new Exception("Numero non valido");
            }
            System.out.println("inserisci un numero da 0 a 4 e premi invio: ");
            int pos = scanner.nextInt();
            if (pos < 0 && pos > 4){
                throw new Exception("Posizione non valida");
            }
            array[pos] = num;
            for (int i = 0; i < 5; i++) {
                System.out.println(array[i]);
            };
        } catch (Exception e){
            logger.error("Errore: " + e.getMessage());
            scanner.nextLine();
        }
    }
    }
}
