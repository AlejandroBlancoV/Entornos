package com.cebem.rickandmorty.utils;

public class Utils {
    public static boolean isPalindrome(String word) {
        String inverseWord = new StringBuilder(word).reverse().toString();
        // String inverseWord = sb.reverse().toString();
        return inverseWord.equalsIgnoreCase(word);

    }
}
