package com.acn.mara;

import java.util.ArrayList;

public class Es22 {

	public static void main(String[] args) {
		/* 22. Scrivere un programma Java per stampare tutti gli elementi di un ArrayList 
		 * utilizzando la posizione degli elementi. */
		ArrayList <Character> alfa= new ArrayList <>();
		alfa.add('a');
		alfa.add('b');
		alfa.add('c');
		alfa.add('d');
		alfa.add('e');
		alfa.add('f');
		
		for (int i=0; i<alfa.size(); i++) {
			System.out.println("Posizione: " + i + " elemento: "+alfa.get(i));
		}
	}

}
