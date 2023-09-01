package com.acn.mara;

import java.util.Scanner;

public class Es07 {

	public static void main(String[] args) {
		//7. Scrivere un programma Java per cercare un elemento in un elenco di array.

		Scanner sc= new Scanner (System.in);
		boolean trovato= false;
		int [] numeri= {0, 1, 2, 3, 4, 5};
		System.out.println("Quale elemento vuoi cercare?");
		int cerca= sc.nextInt();
		for (int numero: numeri) {
			if (numero==cerca) {
				trovato= true;
			}
		}
		if (trovato)
			System.out.println("l'elemento è presente nell'array");
		else 
			System.out.println("l'elemento non è presente");
		sc.close();
	}

}
