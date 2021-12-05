package com.basicjavaprogram;


//in fibonacci series , next number is the sum of previous two number . 

public class FibonacciDemo {

	public static void main(String[] args) {
		
		int n1 = 0 ;
		int n2 = 1;
		int n3,i,count = 8;
		
		System.out.println(n1 + " " + n2);   //printing 0 and 1
		
		for(i = 2;i<count;i++)     //loop start from 2 because 0,1 are already print
		{
			
           n3 = n1 + n2;
           System.out.println(" " +n3);
           n1 = n2;
           n2 = n3;
			
		}

	}

}
