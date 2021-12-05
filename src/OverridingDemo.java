
class E
{
	
	//int i;
	public void show()
	{
		System.out.println("in E");
	}
}

class F extends E
{
	//int i;
	public void show()
	{
	//	i = 8; //this show class f int i
		
		//super.i = 6; //this show super class int i
		
	//	super.show();
		
		System.out.println("in F");
	}
}
public class OverridingDemo
  {
     public static void main (String[] args)
     {
    	 F f = new F();
    	 f.show();
     }
}
