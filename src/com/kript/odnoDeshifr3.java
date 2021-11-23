package com.kript;

import java.util.Scanner;

public class odnoDeshifr3 {
    public static void main(String[] arg){
        Scanner in=new Scanner(System.in);
        System.out.println("Введите зашифрованное сообщение:");
        String inputText=in.nextLine();
        byte[] inputMas = inputText.getBytes();
        char[] outputMas = new char[inputMas.length];
        String mas ="";
        int slovo,j=0;
        System.out.println("Введите ключ:");
        int key=in.nextInt();
        for (int i=0;i<inputMas.length;i++){
            while(inputText.charAt(i)!=','){ mas+=inputText.charAt(i);i++;}
            slovo=Integer.parseInt(mas.toString());
            outputMas[j]=(char)(slovo-key);
            j++;
            mas = "";
        }
       for (char outptmas : outputMas) System.out.print(outptmas);
    }
}
