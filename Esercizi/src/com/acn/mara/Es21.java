package com.acn.mara;

import java.util.ArrayList;
import java.util.Scanner;

public class Es21 {

	public static void main(String[] args) {
		/* 21. Scrivere un programma Java per sostituire il secondo elemento di un ArrayList
		 *  con l'elemento specificato.
		 */

		Scanner sc= new Scanner (System.in);

		ArrayList <Integer> numeri= new ArrayList<>();
		numeri.add(0);
		numeri.add(2);
		numeri.add(2);
		numeri.add(3);

		System.out.println("Inserisci il nuovo elemento: ");
		int nuovo= sc.nextInt();

		numeri.set(1, nuovo);

		System.out.println(numeri);
		sc.close();
	}

}
