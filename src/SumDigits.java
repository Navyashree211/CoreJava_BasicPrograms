
public class SumDigits
{
           public static void main(String[] args)
           {
        	   int num = 2243;
        	   
        	   int sum = 0; int digit = 0;
        	   
        	   while (num>0)
        	   { 
        		   digit = num%10;
        		   sum = sum + digit;
        		   num = num/10;
        	   }
        	   System.out.println("Sum of digits of number = " + sum);
        		    
        	   }     		   
           }
	

