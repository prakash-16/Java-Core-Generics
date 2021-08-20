package com.bridgelabz.JCG;

public class genericBasedPrograms {
	public int i;
	
	
	public String maxInteger(String a, String b, String c) {
		if(a.compareTo(b) == 1) {
			if(a.compareTo(c) == 1) {
				return a;
			}
			else {
				return c;
			}
		}
		else {
			if(b.compareTo(c) == 1) {
				return b;
			}
			else {
				return c;
			}
		}
			
	}
	
	public static void main(String[] args) {
		genericBasedPrograms B1 = new genericBasedPrograms();
		System.out.println("The maximum number in the list is  " + B1.maxInteger("Bananana","Apple","Peach"));
	}

}
