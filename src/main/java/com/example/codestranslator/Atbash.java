package com.example.codestranslator;
import java.util.HashMap;
public class Atbash {
    static String[] ALPHA = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
            "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
            "0","1","2","3","4","5","6","7","8","9"};
    static String[] ATBASH = {"z","y","x","w","v","u","t","s","r","q","p","o","n","m","l","k","j","i","h","g","f","e","d","c","b","a",
    "Z","Y","X","W","V","U","T","S","R","Q","P","O","N","M","L","K","J","I","H","G","F","E","D","C","B","A",
    "9","8","7","6","5","4","3","2","1","0"};
    public static HashMap<String, String> ALPHA_TO_ATBASH = new HashMap<>();
    public static HashMap<String, String> ATBASH_TO_ALPHA= new HashMap<>();
    static
    {
        for (int i=0; i < ALPHA.length && i < ATBASH.length; i++) {
            ALPHA_TO_ATBASH.put(ALPHA[i], ATBASH[i]);
            ATBASH_TO_ALPHA.put(ATBASH[i], ALPHA[i]);
        }
    }
    public static String atbashToAlpha(String atbashCode)
    {
        StringBuilder builder = new StringBuilder();
        String[] words = atbashCode.trim().split("   ");
        for (String word : words)
        {
            for (String letter : word.split(" "))
            {
                String alpha = ATBASH_TO_ALPHA.get(letter);
                builder.append(alpha);
            }
            builder.append(" ");
        }
        return builder.toString();
    }
    public static String alphaToAtbash (String englishCode)
    {
        StringBuilder builder = new StringBuilder();
        String[] words = englishCode.trim().split(" ");
        for (String word : words)
        {
            for(int i = 0; i < word.length(); i++)
            {
                String atbash = ALPHA_TO_ATBASH.get(word.substring(i, i+1).toLowerCase());
                builder.append(atbash).append(" ");
            }
            builder.append("  ");
        }
        return builder.toString();
    }
}
