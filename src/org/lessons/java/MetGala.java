package org.lessons.java;

import java.util.Scanner;

public class MetGala {
    public static void main(String[] args) {
        /*
            State lavorando col servizio di sicurezza del Met Gala 2024 e il vostro compito è di assicurarvi
            che accedano alla festa solo gli invitati presenti sulla lista (in fondo al post).
            Nel programma bisogna:
            creare e inizializzare l’array contenente i nomi degli invitati
            chiedere all’utente come si chiama
            verificare che il nome sia presente nella lista
            lasciarlo entrare o rispedirlo cortesemente da dove è venuto :occhiali_da_sole:
            Lista invitati: Jennifer Lopez, Zendaya, Chris Hemsworth, Bad Bunny, Cara Delevingne, Kendall Jenner, Uma Thurman, Damiano David, Luca Guadagnino
        */

        String[] guests = { "Jennifer Lopez", "Zendaya", "Chris Hemsworth", "Bad Bunny", "Cara Delevingne", "Kendall Jenner", "Uma Thurman", "Damiano David", "Luca Guadagnino" };

        String userName;
        Scanner scanner = new Scanner(System.in);
        boolean found = false;

        System.out.println("Nome?: ");
        userName = scanner.nextLine();

        for (int i = 0; i < guests.length; i++) {
            if (guests[i].equalsIgnoreCase(userName)) {
                System.out.println("You can come in");
                found = true;
            }
        }

        if (!found) {
            System.out.println("You shall not pass!");
        }
    }
}
