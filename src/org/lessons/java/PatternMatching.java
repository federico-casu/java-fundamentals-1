package org.lessons.java;

import java.util.Scanner;

public class PatternMatching {
    public static void main(String[] args) {
        /*
            Data una stringa e un carattere scelto dall'utente, calcolare la
            lunghezza della sequenza più lunga di quel carattere all'interno della
            stringa. Stampare sia la lunghezza trovata, che la posizione (l'indice
            del primo carattere della sequenza) all'interno della stringa.
            ESEMPIO:
            stringa: aaabaabbbbaaaabab  carattere: 'a'    lunghezza massima: 4  indice: 10
            Se esistono due sequenze con la stessa lunghezza massima, restituire i dati relativi
            all'ultima all'interno della stringa (quella con indice di inizio più alto)
        */

        String string;
        char userChar;
        int oldIndex, oldCount, newIndex, newCount;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la stringa: ");
        string = scanner.nextLine();
        System.out.println("Inserisci il carattere da cercare: ");
        userChar = scanner.next().charAt(0);

        oldCount = 0;
        newCount = 0;
        oldIndex = 0;
        newIndex = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == userChar) {
                newCount++;
                if (i == 0 || string.charAt(i-1) != userChar) {
                    newIndex = i;
                }
            } else {
                if (newCount > oldCount) {
                    oldCount = newCount;
                    oldIndex = newIndex;
                }
                newCount = 0;
                newIndex = 0;
            }
        }

        System.out.println("Stringa: " + string);
        System.out.println("Carattere cercato: " + userChar);
        if (oldCount > newCount) {
            System.out.println("Lunghezza massima: " + oldCount);
            System.out.println("Indice: " + oldIndex);
        } else {
            System.out.println("Lunghezza massima: " + newCount);
            System.out.println("Indice: " + newIndex);
        }
    }
}
