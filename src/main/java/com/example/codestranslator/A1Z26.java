package com.example.codestranslator;

import java.util.HashMap;

public class A1Z26 {
    static String[] ALPHA = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","1","2","3","4","5","6","7","8","9","0","!",",","?",".","-"};
    static String[] A1Z26 = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21",
    "22","23","24","25","26","n1","n2","n3","n4","n5","n6","n7","n8","n9","n0","!",",","?",".","-"};
    public static HashMap<String, String> ALPHA_TO_A1Z26 = new HashMap<>();
    public static HashMap<String, String> A1Z26_TO_ALPHA= new HashMap<>();
    static
    {
        for (int i=0; i < ALPHA.length && i < A1Z26.length; i++) {
            ALPHA_TO_A1Z26.put(ALPHA[i], A1Z26[i]);
            A1Z26_TO_ALPHA.put(A1Z26[i], ALPHA[i]);
        }
    }
    public static String a1Z26ToAlpha(String A1Z26Code)
    {
        StringBuilder builder = new StringBuilder();
        String[] words = A1Z26Code.trim().split("   ");
        for (String word : words)
        {
            for (String letter : word.split(" "))
            {
                String alpha = A1Z26_TO_ALPHA.get(letter);
                builder.append(alpha);
            }
            builder.append(" ");
        }
        return builder.toString().toUpperCase();
    }
    public static String alphaToA1Z26 (String englishCode)
    {
        StringBuilder builder = new StringBuilder();
        String[] words = englishCode.trim().split(" ");
        for (String word : words)
        {
            for(int i = 0; i < word.length(); i++)
            {
                String A1Z26 = ALPHA_TO_A1Z26.get(word.substring(i, i+1).toLowerCase());
                builder.append(A1Z26).append(" ");
            }
            builder.append("  ");
        }
        return builder.toString();
    }
}

