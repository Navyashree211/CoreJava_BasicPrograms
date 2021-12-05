class W
{
	public W()
	{
		System.out.println("in W");
	}
	public W(int i)
	{
		System.out.println("in W int");
		
	}
}

class V extends W

{
	public V()
	{
		super(5);
		System.out.println("in V");
	}
	public V(int i)
	{
		super(i);
		System.out.println("in V int");
		
	}
}

public class SuperDemoEx
 {
	public static void main (String[] args)
	{
		V v = new V();	
		
}

}
