package com.kript;

public class poliDeshif4 {
    public static void main(String[] args){
        String inputText="grgonaqwwzzzybswmkxac";
        char[] input=inputText.toCharArray();
        String output = "";
        for(int i=0;i<input.length;i++){
            i+=2;
            String rab = "";
            rab+=input[i-2];rab+=input[i-1];rab+=input[i];
            switch (rab) {
                case ("grg") -> output+="top";
                case ("ona") -> output+="sec";
                case ("gww") -> output+="ret";
                case ("zzz") -> output+="int";
                case ("ybs") -> output+="hew";
                case ("wmk") -> output+="orl";
                case ("xac") -> output+="dip";
            }
        }
        System.out.println(output);
    }
}
