package com.acn.mara;

import java.util.Scanner;

public class Es12 {

	public static void main(String[] args) {
		//12. Scrivere un programma Java per estrarre una porzione di un elenco di array.

		Scanner sc= new Scanner (System.in);

		int [] elenco = {0, 1, 2, 3, 4, 5};

		System.out.println("indice inizio:");
		int inizio= sc.nextInt();
		System.out.println("indice fine:");
		int fine= sc.nextInt();

		sc.close();

		if (inizio<0 || fine > elenco.length || inizio==fine) {
			System.out.println("indici non validi");
		}

		int [] porzione = new int [fine-inizio+1];
		for (int i=0; i<porzione.length; i++) {
			porzione[i]=elenco[inizio+i];
			System.out.println(porzione[i]);
		}

	}

}
