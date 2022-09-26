package com.day21sept.ejercicioUno;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.println("Introduce una frase");
        String phrase = inputUser.nextLine();

        String result = phraseWithVocals(phrase);
        System.out.println(result);
        String[] words = phrase.split("\\s+");
        System.out.println(Arrays.toString(words) + "main result");
    }
    // Methods
    private static String phraseWithVocals(String phrase) {
        String[] vocals = {"a","e","i","o","u"};
        String[] wordsPhrase = phrase.toLowerCase().split("\\s+");

        String newPhrase = " ";
//        for (int i = 0; i < wordsPhrase.length; i++) {
//
//            }
//
//        }
//        String.join(" ", wordsPhrase);
        return  newPhrase;
    }



}
