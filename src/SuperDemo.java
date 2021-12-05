class Shape
{
	void area()
	{
		System.out.println("This is area of shape");
	}
}

class Circle extends Shape
{
	void area()
	{
		super.area();
	}
}

public class SuperDemo
 {
    public static void main (String[] args)
    {
    	Circle c = new Circle ();
    	c.area();
    }
}
