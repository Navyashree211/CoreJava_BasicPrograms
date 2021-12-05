interface Asd
{
	void show();
}

public class AnonymousInterfaceEx
 {
    public static void main (String[] args)
    {
    	//Asd ss = ()-> System.out.println("i'm good");  //this is show lambda expression
    	
    	
    	Asd ss = new Asd()
    			{
    		public void show()
    		{
    			System.out.println("I'm the best trust me");
    		}
    			};
    			
    			ss.show();
    }
}
