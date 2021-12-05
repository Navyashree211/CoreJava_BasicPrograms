interface Abc
{
	void show();
}

class Implementor implements Abc
{
	public void show()
	{
		System.out.println("anything");
	}
}

public class InterfaceDemos
  {
	public static void main (String[] args)
	{
		Abc abc = new Implementor();
		abc.show();
	}

}
