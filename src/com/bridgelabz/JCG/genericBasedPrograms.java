package com.bridgelabz.JCG;

public class genericBasedPrograms {
	
	
	public float maxFloat(float a, float b, float c) {
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
		System.out.println("The maximum number in the list is - " + B1.maxFloat(2.4444f,2.4446f,2.4447f));
	}

}
