package com.bridgelabz.javacoreconceptsgenerics;

public class PrintArray {
	public static void main(String[] args) {
		Integer[] a = {1,2,3,4,5};
		Double[] b = {1.1,2.1,3.1,4.1,5.1};
		Character[] c = {'a','b','c','d','e'};
		toPrint(a);
		toPrint(b);
		toPrint(c);
	}
	private static <E> void toPrint(E[] inputArray) {
		for(E element : inputArray) {
			System.out.println(element);
		}	
	}
}
