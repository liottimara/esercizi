package com.acn.mara;

import java.util.ArrayList;

public class Es06 {
	public static void main(String[] args) {
		
		//6. Scrivere un programma Java per rimuovere il terzo elemento da un elenco di array.
		
		int num1= 0;
		int num2= 1;
		int num3= 2;
		int num4= 3;
		int num5= 4;
		
		ArrayList<Integer> numeri= new ArrayList<>();
		
		numeri.add(num1);
		numeri.add(num2);
		numeri.add(num3);
		numeri.add(num4);
		numeri.add(num5);
		
		numeri.remove(2);
		
		System.out.println(numeri);
	
	}
}
