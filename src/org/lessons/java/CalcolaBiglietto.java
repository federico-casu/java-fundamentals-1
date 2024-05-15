package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {

    /*
        Il programma dovrà chiedere all’utente il numero di chilometri che vuole percorrere e l’età del passeggero.
        Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio, secondo queste regole: il prezzo
        del biglietto è definito in base ai km (0.21 € al km) va applicato uno sconto del 20% per i minorenni va applicato
        uno sconto del 40% per gli over 65.
        Il programma va implementato nel metodo main della classe CalcolaBiglietto.
        Per acquisire l’input dell’utente usate la classe Scanner, come visto stamattina a lezione.
     */

    public static void main(String[] args) {
        double distance;
        int age;

        double pricePerKm = 0.21;
        double underageDiscount = 0.2;
        double over65Discount = 0.4;

        double tiketPrice;

        Scanner scanner = new Scanner(System.in);
//        Scanner userInAge = new Scanner(System.in);

        System.out.print("Quanti chilometri vuoi percorrere?: ");
        distance = Double.parseDouble(scanner.nextLine());
        System.out.print("Quanti anni hai?: ");
        age = Integer.parseInt(scanner.nextLine());

        if (age < 18) {
            tiketPrice = (distance * pricePerKm) * (1 - underageDiscount);
        } else if (age >= 65) {
            tiketPrice = (distance * pricePerKm) * (1 - over65Discount);
        } else {
            tiketPrice = distance * pricePerKm;
        }

        System.out.printf("Il costo del biglietto é pari a %.2f $", tiketPrice);
    }

}
