package com.acn.mara;

import java.util.Arrays;

public class Es08 {

	public static void main(String[] args) {
		// 8. Scrivere un programma Java per ordinare un dato elenco di array.
		
		int [] numeri= {6, 40, -9, 0, 3};
		
		Arrays.sort(numeri);
		
		for(int numero: numeri) {
			System.out.println(numero);
		}
	}

}
