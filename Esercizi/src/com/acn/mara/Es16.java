package com.acn.mara;

public class Es16 {

	public static void main(String[] args) {
		// 16. Scrivere un programma Java per clonare un elenco di array in un altro elenco di array.

		char [] alfa = {'a', 'b', 'c', 'd'};
		char [] beta= {'e', 'f', 'g', 'h', 'i'};
		
		
		beta= alfa.clone();
		for (char lettera: beta) {
			System.out.println(lettera);
		}
	}

}
