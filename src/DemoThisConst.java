class Calc2
{
	int num1;
	int num2;
	
	public Calc2(int num1 , int num2 )
	{
//		this.num1 = num1;
		this.num1=num1;
		this.num2=num2;
		
//		this.num2 = num2;
	
	}
}

        public class DemoThisConst
         {
        	public static void main(String[] args)
        	{
        		Calc2 efg = new Calc2(6,13);
        		
        		System.out.println("Calc2 num1 :" +efg.num1 +"\nCalc2 num2 :" +efg.num2);
        	
        		//System.out.println(efg.num2);
        	}

}
