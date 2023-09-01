package com.acn.mara;

public class Es13 {
	public static void main(String[] args) {
		//13. Scrivere un programma Java per confrontare due elenchi di array.

		char [] caratteri1= {'a', 'b', 'c', 'd'};
		char [] caratteri2 = {'a', 'h', 'c', 'd'};
		boolean isEqual= true;		

		if(caratteri1.length != caratteri2.length) 
			System.out.println("I due array non sono confrontabili");
		else {
			for (int i=0; i<caratteri1.length; i++) {
				if (caratteri1[i]!=caratteri2[i])
					isEqual= false;
			}
		}
		if (isEqual)
			System.out.println("Sono uguali");
		else
			System.out.println("Sono diversi");
	}
}
