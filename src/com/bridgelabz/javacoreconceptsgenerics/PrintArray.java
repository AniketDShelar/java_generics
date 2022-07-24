package com.bridgelabz.javacoreconceptsgenerics;

public class PrintArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		double[] b = {1.1,2.1,3.1,4.1,5.1};
		char[] c = {'a','b','c','d','e'};
		toPrint(a);
		toPrint(b);
		toPrint(c);
	}
	private static void toPrint(int[] a) {
		for(int x : a) {
			System.out.println(x);
		}	
	}
	private static void toPrint(double[] b) {
		for(double y : b) {
			System.out.println(y);
		}
	}
	private static void toPrint(char[] c) {
	for(char z : c) {
		System.out.println(z);
	}
}

}
