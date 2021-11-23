package com.kript;

public class poligam4 {
    public static void main(String[] args){
        String inputText="topsecretintheworldip";
        char[] input=inputText.toCharArray();
        String output = "";
        for(int i=0;i<input.length;i++){
            i+=2;
            String rab = "";
            rab+=input[i-2];rab+=input[i-1];rab+=input[i];
            switch (rab) {
                case ("top") -> output+="grg";
                case ("sec") -> output+="ona";
                case ("ret") -> output+="qww";
                case ("int") -> output+="zzz";
                case ("hew") -> output+="ybs";
                case ("orl") -> output+="wmk";
                case ("dip") -> output+="xac";
            }
        }
        System.out.println(output);
    }
}
