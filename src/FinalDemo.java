class AA
{
	public final void show()
	{
		System.out.println(" In AA show");
	}
}
class BB extends AA
{
	public void show()    // we can't override final method. final method inherit but can't override.
	{
		System.out.println(" In BB show");
	}
}


public class FinalDemo
 {
	public static void main (String [] args)
	{
		BB bb = new BB();
		bb.show();
	}

}
