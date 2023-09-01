package com.acn.mara;

import java.util.Scanner;

public class Es05 {

	public static void main(String[] args) {
		/*5. Scrivere un programma Java per aggiornare l'elemento specifico 
		 * dell'array in base all'elemento specificato.*/

		Scanner sc= new Scanner(System.in);

		int [] numeri= {1, 2, 3, 4, 5};

		System.out.println("Quale elemento vuoi aggiornare?");
		int prima= sc.nextInt();
		System.out.println("Inserisci il nuovo valore");
		int dopo= sc.nextInt();

		for (int numero: numeri) {
			if(numero==prima) {
				numero=dopo;
			}
			System.out.println(numero);
		}
		sc.close();
	}
}
