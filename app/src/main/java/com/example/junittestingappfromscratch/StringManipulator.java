package com.example.junittestingappfromscratch;

public class StringManipulator {
    private static StringManipulator ourInstance = new StringManipulator();

    public static StringManipulator getInstance() {
        if (ourInstance == null) {
            ourInstance = new StringManipulator();
        }
        return ourInstance;
    }

    private StringManipulator() {
    }


    public boolean isLessThan10(String input) {
        if (input == null) {
            return false;
        }
        return input.length() < 10;
    }


    public boolean isOddLength(String input) {
        return input.length() % 2 != 0;

    }

    public String zipperWords(String first, String second) {

        StringBuilder zipper = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < first.length() && j < second.length()) {
            zipper.append(first.charAt(i++));
            zipper.append(second.charAt(j++));
        }
        return zipper.toString();
    }


//    public String deconstructedWord(String word) {
//        StringBuilder deconstruct = new StringBuilder();
//
//        for (int i = 0; i < word.length(); i++) {
//            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
//                deconstruct.append(word);
//            } else {
//
//            }
//            return deconstruct.toString();
//        }
//    }

    public int wordSum(String first, String second) {

        return first.length() + second.length();
    }


    public String longestWord(String[] words){
        String length ="";
        String longest;

        for (int i = 0; i < words.length; i++) {
            if(words.length > longest.length()){
                longest = words[i];
                length = String.valueOf(words[i].length());

            }
            return longest;
        }
    }

}
