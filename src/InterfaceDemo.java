interface Writer
{
	void Writer();
	
}
class Pen implements Writer
{
	public void Writer()
	{
		System.out.println(" I am pen");
	}
}
class Pencil implements Writer
{
	public void Writer()
	{
		System.out.println(" I am pencil");
	}
}

class Kit
{
	public void doSomething(Writer p)
	{
	    p.Writer();
	}
}

public class InterfaceDemo

    {
	public static void main (String[] args)
	{
		Kit k = new Kit();
		Writer p = new Pen();
		Writer pc = new Pencil();
		k.doSomething(pc);
		
	}

}
