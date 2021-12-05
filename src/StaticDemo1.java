
class Emps
{
	int eid;
	int salary;
	static String ceo;
	
	
	static
	{
		ceo = "larry";
		System.out.println("In static");
	}
	
	public Emps()
	{
		eid = 1;
		salary = 30000;
		System.out.println("In constructor");
	
	}
	
	
	public void show()
	{
		System.out.println(eid + " : " + salary + " : " + ceo);
	}
}
	
public  class StaticDemo1 
 {

	public static  void main (String[] args)
	{
		
	Emps Navin = new Emps();
	
	Emps Rakesh = new Emps();
	
	Navin.show();
	Rakesh.show();
	}
 }
 

