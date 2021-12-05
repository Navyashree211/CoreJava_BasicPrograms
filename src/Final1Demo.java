class Aa
{
	final int DAY;  //constant
   public 	Aa()
	{
		DAY = 10;
		//DAY = 20;   // we can't variable change due to final variable is constant.
	}
	
}

public class Final1Demo
 {
	public static void main (String[] args)
	{
		 Aa Obj = new Aa();
		 System.out.println(Obj.DAY);
	}

}
