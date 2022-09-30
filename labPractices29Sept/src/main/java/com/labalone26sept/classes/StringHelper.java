package com.labalone26sept.classes;

public class StringHelper {



    public static String reverse(String text){
        String reverseString = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverseString += text.charAt(i);
        }
        return reverseString;
    }


    public static String encoder(String text){
        String word = text;
        String word1 = word.replaceAll("[AEIOUaeiou]", "@");

        String word2 =  word1;
        for( int i = 0; i <= word.length(); i++) {
            word2 = word2.replaceFirst("@", Integer.toString(i));
        }
        return word2;
    }
}
