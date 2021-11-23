package com.kript;

import java.util.Scanner;

public class polyalfDeshif5 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Введите засекреченное сообщение:");
        String inputText=in.nextLine();
        byte[] input=inputText.getBytes();
        String output="";
        final int key1=6;
        final int key2=1;
        final int key3=4;
        char begin='a';
        for(int i=0;i<input.length;i++){
            if(i%3==0) output+=(char) (begin + (input[i]-begin-key1+26)%26);
            if(i%3==1)output+=(char) (begin + (input[i]-begin-key2+26)%26);
            if(i%3==2)output+=(char) (begin + (input[i]-begin-key3+26)%26);
        }
        System.out.println(output);
    }
}
