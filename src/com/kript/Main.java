package com.kript;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//String vvod = "секретныеданныеномер";
		Scanner in = new Scanner(System.in);
		System.out.print("Введите секретное сообщение\n");
		String vvod = in.nextLine();
		char[] vvod2 = vvod.toCharArray();
		int shirina = 5;
		int dlina = vvod.length();
		int metka = shirina;
		int o = 3;
		String shifr = "";
		for (int i = 0; i < 8; i++) {
			int visota = 0;
			shirina = metka;
			while (shirina <= 5 && shirina > 0) {
				if (shirina != 1) {shifr += vvod2[shirina - 1 + visota];
				shirina++;
				visota += 5;} else {while(shirina<5){shifr += vvod2[shirina - 1 + visota];
					shirina++;
					visota += 5;}shirina++;}
			}
			if (shirina == 0) {
				switch (o) {
					case (3):
						while (o > 0) {
							visota += 5;
							shirina++;
							shifr += vvod2[shirina - 1 + visota];
							o--;
						}
						o = 2;
						metka++;
						break;
					case (2):
						visota=5;
						while (o > 0) {
							visota += 5;
							shirina++;
							shifr += vvod2[shirina - 1 + visota];
							o--;
						}
						o = 1;
						metka++;
						break;
					case (1):
						shifr += vvod2[shirina+15];
						break;
				}
			}
			metka--;
		}
		System.out.println(shifr);

	}
}
//ердкеееыырсннетнмаон
