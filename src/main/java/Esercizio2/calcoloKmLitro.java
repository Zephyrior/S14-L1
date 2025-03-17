package Esercizio2;

import Esercizio2.Exception.DivisionePerZero;
import Esercizio2.Exception.KmZero;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class calcoloKmLitro {
    private static final Logger logger = LoggerFactory.getLogger(calcoloKmLitro.class);
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            try {
//                logger.data("inserisci consumo e distanza");
                System.out.println("Inserisci il consumo in Litri: ");
                double litri = scanner.nextInt();
                System.out.println("Inserisci la distanza in Km: ");
                double km = scanner.nextInt();
                System.out.println("La distanza percorsa è: " + km);
                System.out.println("Il consumo di litri e: " + litri);
                if (litri == 0){
                    throw new DivisionePerZero("Divisione per zero");
                }
                if(km == 0){
                    throw new KmZero("errore km");
                }
                System.out.println();
                System.out.println("Il consumo in Km/L e: " + ((double) km / litri));
                break;
            } catch (Exception e) {
                logger.error(e.getMessage());
                System.out.println(e.getMessage());
            }
        }
    }
}
