package com.kript;

import java.util.Scanner;

public class odnozvuch3 {
    public static void main(String[] arg){
        Scanner in=new Scanner(System.in);
        System.out.println("Введите секретное сообщение:");
        String inputText=in.nextLine();
        byte inputMas[] = inputText.getBytes();
        int outputMas[]= new int[inputMas.length];
        System.out.println("Введите ключ:");
        int key=in.nextInt();
        for(int i=0;i<inputMas.length;i++){
            char c=(char) inputMas[i];
            boolean start=false;
            if(c >= 'a' && c <= 'z') start = true;
            else if(c >= 'A' && c <= 'Z') start = true;
            if(start){
            outputMas[i]=inputMas[i]+key;
            System.out.print(outputMas[i]);System.out.print(',');}
            else ;
        }
    }
}
