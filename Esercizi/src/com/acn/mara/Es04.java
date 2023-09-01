package com.acn.mara;

import java.util.Scanner;

public class Es04 {
	public static void main(String[] args) {
		/*4. Scrivere un programma Java per recuperare un elemento 
		 * (in corrispondenza di un indice specificato) da un dato elenco di array.
		 */
		Scanner sc= new Scanner (System.in);

		int [] numeri = {1, 2, 3, 4, 5};

		System.out.println("Scegli una posizione [0-4]");
		int indice= sc.nextInt();

		try {
			System.out.println(numeri[indice]);
		} catch (Exception e) {
			System.out.println("posizione non valida, riprova");
			e.printStackTrace();
		}
		sc.close();
	}
}
