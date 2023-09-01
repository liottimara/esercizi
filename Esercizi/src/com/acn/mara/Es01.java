package com.acn.mara;

import java.util.Scanner;

public class Es01 {

	public static void main(String[] args) {
		/*1. Scrivere un programma Java per creare un nuovo elenco di array, 
		 * aggiungere alcuni colori (stringa) e stampare la raccolta. 
		 */

		Scanner sc= new Scanner(System.in);

		String [] colori = new String [5];

		System.out.println("Aggiungi 5 colori");
		String colore1= sc.nextLine();
		colori[0]=colore1;
		String colore2= sc.nextLine();
		colori[1]=colore2;
		String colore3= sc.nextLine();
		colori[2]=colore3;
		String colore4= sc.nextLine();
		colori[3]=colore4;
		String colore5= sc.nextLine();
		colori[4]=colore5;

		for(String colore: colori) {
			System.out.println(colore);
		}

		sc.close();

	}

}
