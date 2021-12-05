class U
{
	public void show()
	{
		System.out.println("In Q show");
	}
}

public class AnonymousDemo
 {
	public static void main (String[] args)
	{
		U q = new U()
				{
			public void show()
			{
				System.out.println("I'm the best");
			}
				};
				q.show();
	}

}
