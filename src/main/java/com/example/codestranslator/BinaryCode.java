package com.example.codestranslator;

import java.util.HashMap;

public class BinaryCode {
    static String[] ALPHA = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","1","2","3","4","5","6","7","8","9","0"};
    static String[] BINARY = {"01100001","01100010","01100011","01100100","01100101","01100110","01100111","01101000","01101001","01101010","01101011","01101100","01101101","01101110","01101111","01110000","01110001","01110010","01110011","01110100","01110101","01110110","01110111","01111000","01111001","01111010","1","10","11","100","101","110",
            "111","1000","1001","0"};
    public static HashMap<String, String> ALPHA_TO_BINARY = new HashMap<>();
    public static HashMap<String, String> BINARY_TO_ALPHA= new HashMap<>();
    static
    {
        for (int i=0; i < ALPHA.length && i < BINARY.length; i++) {
            ALPHA_TO_BINARY.put(ALPHA[i], BINARY[i]);
            BINARY_TO_ALPHA.put(BINARY[i], ALPHA[i]);
        }
    }
    public static String binaryToAlpha(String binaryCode)
    {
        StringBuilder builder = new StringBuilder();
        String[] words = binaryCode.trim().split("   ");
        for (String word : words)
        {
            for (String letter : word.split(" "))
            {
                String alpha = BINARY_TO_ALPHA.get(letter);
                builder.append(alpha);
            }
            builder.append(" ");
        }
        return builder.toString().toUpperCase();
    }
    public static String alphaToBinary (String englishCode)
    {
        StringBuilder builder = new StringBuilder();
        String[] words = englishCode.trim().split(" ");
        for (String word : words)
        {
            for(int i = 0; i < word.length(); i++)
            {
                String morse = ALPHA_TO_BINARY.get(word.substring(i, i+1).toLowerCase());
                builder.append(morse).append(" ");
            }
            builder.append("  ");
        }
        return builder.toString();
    }
}

