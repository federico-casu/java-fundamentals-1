package org.lessons.java;

public class FavFoods {
    public static void main(String[] args) {
        /*
            Nel programma inizializzate un array (con i metodi visti a lezione) con la classifica
            dei vostri cibi preferiti (minimo 5, massimo 10 elementi)
            Poi stampate a video:
            la lunghezza della classifica
            il vostro cibo top (prima posizione della classifica)
            il vostro cibo preferito ma non troppo (ultima posizione della classifica)
            il cibo di mezza classifica, cioè che si trova nella posizione mediana
        */

        String[] favFoods = { "Pizza", "Sushi", "Pasta", "Meat", "Sweets" };

        System.out.println("I have " + favFoods.length + " favorite foods");
        System.out.println("My favorite food is " + favFoods[0]);
        System.out.println("Among my favorite foods, my least favorite is " + favFoods[favFoods.length - 1]);
        System.out.println("In the middle of my favorite food list there's " + favFoods[favFoods.length / 2]);
    }
}
