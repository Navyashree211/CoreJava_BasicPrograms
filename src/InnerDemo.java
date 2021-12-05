class Outer
{
	int a;
	
	public void show()
	{
		
	}
	class Inner
	{
		public void display()
		{
			System.out.println("In Display");
		}
	}
	
}

public class InnerDemo
  {
	public static void main(String[] args)
	{
		Outer Obj = new Outer();
		Obj.show();
		
		Outer.Inner Obj1 = Obj.new Inner();
		Obj1.display();
		
		
	}

}
