class Calculators                           //super
{
	public int add(int i , int j)
	{
		return i + j;
	}
}

class CalcAdv extends Calculators               //sub
{
	public int sub(int i , int j)
	{
		return i - j;
		
	}
}

class CalcVeryAdv extends CalcAdv
   {  
	  public int multi(int i , int j)
	  {
		  return i * j;
		  
	  }
	
}

public class InheritanceDemo 

  {
	public static void main (String[] args)
	{
		CalcVeryAdv C1 = new CalcVeryAdv();   //CalcAdv C1 = new CalcAdv();  //Calculator C1 = New Calculator();
		
		int result1 = C1.add(6,7);            //int result1 = C1.add(3,3);    //int result = C1.add(1,2);
		                                     
		int result2 = C1.sub(13, 7);          //int result2 = C1.sub(11,5);
		
		int result3 = C1.multi(2, 3);
		
		System.out.println(result1);           //System.out.println(result1);  //System.out.println(result);
		
		System.out.println(result2);            //System.out.println(result2);
		
		System.out.println(result3);
		
		
	}

}
