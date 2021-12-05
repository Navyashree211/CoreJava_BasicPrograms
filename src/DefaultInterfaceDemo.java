interface Demoos
{
	void abc();
	default void show()
	{
		System.out.println("i show");
	}
}
class DemoImp implements Demoos
{
	public void abc()
	{
		System.out.println("in abc");
	}
	public void show()
	{
		System.out.println("In new show");
	}
}


public class DefaultInterfaceDemo 
 {
   public static void main (String[] agrs)
   {
	   Demoos Aos = new DemoImp();
	   Aos.abc();
	   Aos.show();
   }
}
