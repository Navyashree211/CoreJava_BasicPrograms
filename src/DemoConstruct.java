class Calc1
{
	int num1;
	int num2;
	
	public Calc1()
	{
		num1 = 6;
		num2 = 6;
		System.out.println("In constructor");
	}
	public Calc1(int n)
	{
		num1 = n;
		num2 = n;
	}
	  public Calc1(double d,int n)
	  {
		  num1 = (int)d;
		  num2 = n;
	  }
}

public class DemoConstruct
 {
   
public static void main (String[] agrs)
   {
	   Calc1 abc = new Calc1(9.5,8); //constructor //Calc(7)
	   
	  
	   System.out.println(abc.num1);
	   
   }
}
