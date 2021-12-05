class A
{
	public void m1()
	{
		System.out.println("Parent");
	}
}

class B extends A
{
	public void m2()
	{
		System.out.println("Child");
	}
}

public class ArrayTestEx
 {
    public static void main (String[] args)
    {
         A p = new A();
         p.m1();
       //  p.m2();   //compile time error
         
         B c = new B();
         c.m1();
         c.m2();
         
         
         A p1 = new B();
         
         p1.m1();
     //  p1.m2();   compile time  error
         
         
    }
 }
