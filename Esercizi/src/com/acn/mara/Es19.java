package com.acn.mara;

import java.util.ArrayList;

public class Es19 {

	public static void main(String[] args) {
		/*19. Scrivere un programma Java per ridurre la capacità di un elenco di array 
		 * in base alla dimensione dell'elenco corrente.
		 */
		ArrayList <Character> alfa= new ArrayList <>(10);
		alfa.add('a');
		alfa.add('b');
		alfa.add('c');
		
		alfa.trimToSize();
		
		System.out.println(alfa);
		
		
		
		
	}

}
