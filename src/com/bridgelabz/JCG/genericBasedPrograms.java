package com.bridgelabz.JCG;

public class genericBasedPrograms<E extends Comparable<E>> {
	public E a;
	public E b;
	public E c;
	public E d;
	
	public genericBasedPrograms(E a, E b,E c, E d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public void maxData() {
	      E max = a;   

	      if(b.compareTo(max) > 0) {
	         max = b;   
	      }

	      if(c.compareTo(max) > 0) {
	         max = c;                   
	      }
	      if(d.compareTo(max) > 0) {
	    	  max = d;
	      }
	      printMax(max);
	   }
	public void printMax(E max) {
		System.out.println("The Maximum data is : " + max);
	}
	
	public static void main(String[] args) {
		genericBasedPrograms<Integer> B1 = new genericBasedPrograms<Integer>(1,2,3,4);
		B1.maxData();
	}
	
}