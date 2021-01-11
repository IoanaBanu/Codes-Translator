package com.example.codestranslator;
public class CaesarCode{
protected static String encrypter(String inputString, int key){
        StringBuffer output;
        Character charac;
        int previousAscii,newAscii;
        output = new StringBuffer();
        for(int i=0;i<inputString.length();i++){
        charac = inputString.charAt(i);
        if(charac.equals(' ')){
        output.append(Character.toString(charac));
        continue;
        }
        previousAscii = (int)charac;
        newAscii = previousAscii + key;
        if(newAscii > 90 && Character.isUpperCase(charac) || newAscii > 122){
        newAscii -= 26;
        }
        output.append(Character.toString((char)newAscii));
        }
        return String.valueOf(output);
        }

protected static String decrypter(String inputString, int key){
        StringBuffer output;
        Character charac;
        int previousAscii,newAscii;
        output = new StringBuffer();

        for(int i=0;i<inputString.length();i++){
        charac = inputString.charAt(i);
        if(charac.equals(' ')){
        output.append(Character.toString(charac));
        continue;
        }
        previousAscii = (int)charac;
        newAscii = previousAscii - key;
        if(newAscii < 65 && Character.isUpperCase(charac) || newAscii < 97){
        newAscii += 26;
        }
        output.append(Character.toString((char)newAscii));
        }
        return String.valueOf(output);
        }


}