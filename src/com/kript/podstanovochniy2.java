package com.kript;
import java.util.Scanner;

public class podstanovochniy2 {
    public static void main(String[] arg){
        //String inputText = "Secret Materials";
        Scanner in=new Scanner(System.in);
        System.out.println("Введите секретное сообщение:");
        String inputText=in.nextLine();
        byte inputMas[] = inputText.getBytes();
        char outputMas[]= new char[inputMas.length];
        System.out.println("Введите ключ:");
        int key=in.nextInt();
        for(int j = 0; j < inputMas.length; j++)
        {
            char c = (char)inputMas[j];
            char first = 0;
            if(c >= 'a' && c <= 'z') first = 'a';
            else if(c >= 'A' && c <= 'Z') first = 'A';
            if(first == 'a'|| first=='A')
                c = (char)( first + (c - first + key + 26) % 26) ;
            outputMas[j] = c;
        }
        String outputText = new String(outputMas);
        System.out.println(outputText);
    }
}
