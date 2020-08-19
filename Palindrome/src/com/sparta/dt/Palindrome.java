package com.sparta.dt;

import java.util.ArrayList;

public class Palindrome {

    public static boolean isPalindrome(String toCheck) {
        String toCheckTrim = toCheck.trim();
        String reverse = "";
        for (int i = 0; i < toCheckTrim.length(); i++) {
            reverse += toCheckTrim.charAt(toCheck.length() - (i + 1));
        }
        if (toCheckTrim.equalsIgnoreCase(reverse)) {
            return true;
        } else {
            return false;
        }
    }


    public static String longestPalindrome(String sentence) {
        String[] splitSentence = sentence.trim().split(" ");
        String longestPalindrome = "";
        ArrayList<String> arrayOfPalindromes = new ArrayList<String>();
        for (String word : splitSentence) {
            if (isPalindrome(word) && word.length() > longestPalindrome.length()) {
                longestPalindrome = word;
                arrayOfPalindromes.add(word);
            } else if (isPalindrome(word) && word.length() == longestPalindrome.length() && !arrayOfPalindromes.contains(word)) {
                arrayOfPalindromes.add(word);
            }
        }
        if (arrayOfPalindromes.isEmpty()) {
            return "No palindromes found in \"" + sentence + "\"";
        } else {
            String allPalindromes = "";
            for (String palindromeInArray : arrayOfPalindromes) {
                allPalindromes += palindromeInArray + ", ";
            }
            return "Palindromes found in \"" + sentence + "\": " + allPalindromes;
        }
    }


}
