package com.acn.mara;

public class Es15 {

	public static void main(String[] args) {
		//15. Scrivere un programma Java per unire due elenchi di array.

		char [] alfa = {'a', 'b', 'c', 'd'};
		char [] beto= {'e', 'f', 'g', 'h'};
		
		char [] alfabeto= new char [alfa.length + beto.length];
		
		for (int i=0; i<alfa.length; i++) {
			alfabeto[i]=alfa[i];
		}
		for (int i=0; i<beto.length; i++) {
			alfabeto[alfa.length+i]=beto[i];
		}
		for(char lettera: alfabeto) {
			System.out.println(lettera);
		}
	}

}
