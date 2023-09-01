package com.acn.mara;

import java.util.Random;

public class Es10 {

	public static void main(String[] args) {

		// 10. Scrivere un programma Java per mescolare gli elementi in un elenco di array.
		Random random= new Random();
		int [] numeri= {0, 1, 2, 3, 4, 5};

		for(int i=0; i<numeri.length; i++) {
			int indice = random.nextInt(numeri.length);
			numeri[indice] = numeri[i];
			System.out.println(numeri[i]);
		}
	}

}
