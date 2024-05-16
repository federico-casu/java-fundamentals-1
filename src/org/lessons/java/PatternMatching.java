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
        int tempIndex, tempCount, newIndex, newCount;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la stringa: ");
        string = scanner.nextLine();
        System.out.println("Inserisci il carattere da cercare: ");
        userChar = scanner.next().charAt(0);

        tempCount = 0;
        newCount = 0;
        tempIndex = -1;
        newIndex = -1;

        for (int i = 0; i < string.length(); i++) { // scorro l'array
            // se il carattere della stringa in posizione i é uguale al carattere ceercato
            if (string.charAt(i) == userChar) {
                newCount++; // incremento il contatore
                // se stiamo confrontando la prima lettera della stringa o se la lettera precedente (la i-1esima) é diversa da quella cercata
                if (i == 0 || string.charAt(i-1) != userChar) { // se
                    newIndex = i; // aggiorno l'indice con la posizione corrente
                }
            } else { // altrimenti
                if (newCount >= tempCount) { // se il nuovo contatore é maggiore o uguale del contatore backup del precedente conteggio
                    tempCount = newCount; // aggiorno il contatore backup con il nuovo conteggio
                    tempIndex = newIndex; // aggiorno l'indice backup con il nuovo indice
                }
                newCount = 0;   // azzero il nuovo contatore
                newIndex = -1;  // azzero il nuovo indice
            }
        }

        System.out.println("Stringa: " + string);
        System.out.println("Carattere cercato: " + userChar);
        if (tempIndex == -1 && newIndex == -1) {    // se gli indici sono ancora nulli
            System.out.println("Carattere non trovato");    // il carattere non é mai stato trovato
        } else if (tempCount > newCount) {  // se il contatore di backup é maggiore dell'ultimo contatore
            System.out.println("Lunghezza massima: " + tempCount);
            System.out.println("Indice: " + tempIndex);
        } else {    // altrimenti
            System.out.println("Lunghezza massima: " + newCount);
            System.out.println("Indice: " + newIndex);
        }

        scanner.close();
    }
}