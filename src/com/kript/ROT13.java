package com.kript;

public class ROT13 {
    public static void main(String[] args){
        String inputText="SecretmassegforYOU";
        byte[] input=inputText.getBytes();
        int key=13;
        String outputText="";
        for(int i=0;i<input.length;i++){
            char s=(char) input[i];
            char first=0;
            if(s>='a'&& s<='z')first='a';
            if(s>='A'&& s<='Z')first='A';
            if(first!=0)s=(char)(first+(s-first+key+26)%26);
            outputText+=s;
        }
        System.out.println(outputText);
    }
}
