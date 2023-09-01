package com.acn.mara;

public class Es09 {
	public static void main(String[] args) {
		//9. Scrivere un programma Java per copiare un elenco di array in un altro.

		int [] numeri1= {0, 7, 8, 45, -10};
		int [] numeri2= {3, 5, 9, 97, 10};

		System.out.println("Array numeri1 prima della copia:");
		for(int numero: numeri1) {
			System.out.println(numero);
		}
		System.out.println("Array numeri2 prima della copia:");

		for (int numero: numeri2) {
			System.out.println(numero);
		}

		numeri2=numeri1.clone();

		System.out.println("Array numeri1 dopo la copia:");
		for(int numero: numeri1) {
			System.out.println(numero);
		}
		System.out.println("Array numeri2 dopo la copia:");
		for (int numero: numeri2) {
			System.out.println(numero);
		}
	}
}
