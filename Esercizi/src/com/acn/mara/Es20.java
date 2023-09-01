package com.acn.mara;

import java.util.ArrayList;

public class Es20 {
	public static void main(String[] args) {

		//20. Scrivere un programma Java per aumentare la dimensione di un elenco di array.

		ArrayList <Character> alfa= new ArrayList <>();
		alfa.add('a');
		alfa.add('b');
		alfa.add('c');

		alfa.ensureCapacity(10);
		System.out.println(alfa);
	}
}
