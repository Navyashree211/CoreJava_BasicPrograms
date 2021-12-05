
public class ExceptioDemoMultiCatch {

	public static void main(String[] args) {
		
		try
		{
			int a[] = new int[5];
			//int a[] = null;
			a[4] = 8;
			
			int i = 7;
			int j = 2;
			int k = i/j;
			
			System.out.println( " output is " + k );
		}
		catch(ArithmeticException e)
		{
			System.out.println( " cannot divide by zero" );
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println( "stay in your limit .." );

		}
		
		catch(Exception e)
		{
			System.out.println("something wrong..");
		}
		finally
		{
			System.out.println("Bye");
		}

	}

}
