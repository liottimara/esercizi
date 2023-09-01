package com.acn.mara;

import java.util.ArrayList;

public class Es18 {

	public static void main(String[] args) {
		//18. Scrivere un programma Java per verificare che un elenco di array sia vuoto o meno.

		ArrayList <Character> alfa= new ArrayList <>();
		alfa.add('a');
		alfa.add('b');
		alfa.add('c');

		boolean isEmpty= alfa.isEmpty();

		if (isEmpty)
			System.out.println("L'ArrayList è vuoto");
		else
			System.out.println("Non è vuoto");



	}

}
