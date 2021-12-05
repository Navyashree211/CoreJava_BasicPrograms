class Casio1
{
	int num1;
	int num2;
	
	String opration;
	
	public Casio1()
	{
		num1 = 0;
		num2 = 0;
		opration = "Nothing";
	}
	
	public Casio1(int i)
	{
		num1 = i;
		num2 = 0;
		opration = "Nothing";
				
	}
	   public Casio1(int i , int j)
	   {
		   num1 = i;
		   num2 = j;
		   opration = "Nothing";
		   
	   }
	
	 public Casio1(int i , int  j , String op)
	 {
		 num1 = i;
		 num2 = j;
		 opration = op;
		 
	 }
}

public class ConstrutorOverloadingDemo

 {
	public static void main (String[] args)
	{
		Casio1 obj = new Casio1(6,13,"ANavya");
		 System.out.println("Casio1 nnum1 :"+obj.num1 + "\nCasio1 num2 :"+obj.num2 + "\nCasio1 opration :"+obj.opration);
				
	}

}
