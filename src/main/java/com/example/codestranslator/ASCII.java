package com.example.codestranslator;

import java.util.HashMap;

public class ASCII {
    static String[] ALPHA = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
    "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
            "1","2","3","4","5","6","7","8","9","0",
            "!","#","$","%","&","'","(",")","*","+",",","-",".","/",":",";",">","=","<","?","@","[","]","^","_"};
    static String[] ASCII = {"97","98","99","100","101","102","103","104","105","106","107","108","109","110","111","112","113","114","115","116","117","118","119","120","121","122",
    "65","66","67","68","69","70","71","72","73","74","75","76","77","78","79","80","81","82","83","84","85","86","87","88","89","90",
    "49","50","51","52","53","54","55","56","57","48",
    "33","35","36","37","38","39","40","41","42","43","44","45","46","47","58","59","60","61","62","63","64","91","93","94","95"};
    public static HashMap<String, String> ALPHA_TO_ASCII = new HashMap<>();
    public static HashMap<String, String> ASCII_TO_ALPHA= new HashMap<>();
    static
    {
        for (int i=0; i < ALPHA.length && i < ASCII.length; i++) {
            ALPHA_TO_ASCII.put(ALPHA[i], ASCII[i]);
            ASCII_TO_ALPHA.put(ASCII[i], ALPHA[i]);
        }
    }
    public static String asciiToAlpha(String asciiCode)
    {
        StringBuilder builder = new StringBuilder();
        String[] words = asciiCode.trim().split("   ");
        for (String word : words)
        {
            for (String letter : word.split(" "))
            {
                String alpha = ASCII_TO_ALPHA.get(letter);
                builder.append(alpha);
            }
            builder.append(" ");
        }
        return builder.toString();
    }
    public static String alphaToASCII (String englishCode)
    {
        StringBuilder builder = new StringBuilder();
        String[] words = englishCode.trim().split(" ");
        for (String word : words)
        {
            for(int i = 0; i < word.length(); i++)
            {
                String morse = ALPHA_TO_ASCII.get(word.substring(i, i+1).toLowerCase());
                builder.append(morse).append(" ");
            }
            builder.append("  ");
        }
        return builder.toString();
    }
}

