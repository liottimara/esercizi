package com.acn.mara;

public class Es03 {

	public static void main(String[] args) {
		// 3. Scrivere un programma Java per inserire un elemento nell'elenco 
		//dell'array nella prima posizione.

		int [] numeri= {1, 2, 3, 4, 5};

		int num=6;
		numeri[0]= num;

		for (int numero: numeri) {
			System.out.println(numero);
		}

	}

}
