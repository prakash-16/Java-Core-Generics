package com.bridgelabz.JCG;

public class genericBasedPrograms<E extends Comparable<E>> {
	public E a;
	public E b;
	public E c;
	
	public genericBasedPrograms(E a, E b,E c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public E maxData() {
	      E max = a;   

	      if(b.compareTo(max) > 0) {
	         max = b;   
	      }

	      if(c.compareTo(max) > 0) {
	         max = c;                   
	      }
	      return max;
	   }
	
	public static void main(String[] args) {
		genericBasedPrograms<Integer> B1 = new genericBasedPrograms<Integer>(1,2,3);
		System.out.println("The Maximum data is : " + B1.maxData());
	}
	
}