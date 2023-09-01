package com.acn.mara;

import java.util.Scanner;

public class Es14 {

	public static void main(String[] args) {
		// 14. Scrivere un programma Java per scambiare due elementi in un elenco di array.

		Scanner sc= new Scanner(System.in);
		int [] numeri= {1, 2, 3, 4, 5};

		System.out.println("Quali posizioni vuoi scambiare?");
		System.out.println("Indice 1: ");
		int indice1= sc.nextInt();
		System.out.println("Indice 2: ");
		int indice2= sc.nextInt();

		if (indice1<numeri.length && indice1>=0 && indice2>=0 && indice2<numeri.length) {
			int indice3= numeri[indice1];
			numeri[indice1]=numeri[indice2];
			numeri[indice2]=indice3;

			for (int numero: numeri) {
				System.out.println(numero);
			}
		}else 
			System.out.println("Indici non validi");
	
		sc.close();
	}
}
