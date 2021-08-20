package com.bridgelabz.JCG;

public class genericBasedPrograms {
	
	
	public int maxInteger(int a, int b, int c) {
		if(a > b) {
			if(a>c) {
				return a;
			}
			return c;
		}
		else {
			if(b > c) {
				return b;
			}
			return c;
		}
	}
	
	public static void main(String[] args) {
		genericBasedPrograms B1 = new genericBasedPrograms();
		System.out.println("The maximum number in the list is - " + B1.maxInteger(5,3,2));
	}

}
