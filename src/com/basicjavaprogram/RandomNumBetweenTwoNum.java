package com.basicjavaprogram;

//import java.lang.Math;

public class RandomNumBetweenTwoNum 
{
	public static void mian (String[] args)
	{
		int min = 200;
		int max = 400;
		
		//generate random double value from 200 to 400
		
		System.out.println("Random value of type double between "+min+ "to" +max+ ":");
		double a = (double)(Math.random()*(max-min+1)+min);
		
		System.out.println(a);
		
		//generate random int value from 200 to 400
		
		System.out.println("Random value of type int between "+min+ "to" +max+ ":");
         int b = (int)(Math.random()*(max-min+1)+min);
         System.out.println(b);
         
	}
	

}
