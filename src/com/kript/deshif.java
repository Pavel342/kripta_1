package com.kript;

import java.util.Scanner;

public class deshif {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сообщение\n");
        String vvod = in.nextLine();
        char[] vvod2 = vvod.toCharArray();
        String shifr = "";
        shifr+=vvod2[10];shifr+=vvod2[6];shifr+=vvod2[3];shifr+=vvod2[9];shifr+=vvod2[0];shifr+=vvod2[14];
        shifr+=vvod2[11];shifr +=vvod2[7];shifr+=vvod2[13];shifr+=vvod2[2];
        shifr+=vvod2[17];shifr+=vvod2[12];shifr+=vvod2[15];shifr+=vvod2[8];shifr+=vvod2[4];
        shifr +=vvod2[19];shifr+=vvod2[18];shifr+=vvod2[16];shifr+=vvod2[5];shifr+=vvod2[1];
        System.out.print(shifr);
    }

}
