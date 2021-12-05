package com.navya;

public class ExceptionDemoUserDefind {

	public static void main (String[] args)
	{
		int i,j;
		i = 8;
		j = 9;
		//j = 0;
		
		try
		{
			int k = i/j;
			
			if(k==0)
				throw new NavyaException("This is not possible");
				
			System.out.println(k);
		}
		catch(NavyaException e)
		{
			System.out.println( "Error " +  e.getMessage());
		}
	}
	
}
