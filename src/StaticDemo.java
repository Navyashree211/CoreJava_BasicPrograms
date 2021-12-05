
class Emp
{
	int eid;
	int salary;
	static String ceo;
	//String ceo;
	
	public void show()
	{
		System.out.println(eid + " : " + salary + " : " + ceo);
	}
	
}

public class StaticDemo 
{

	public static void main(String[] args)
	{
       Emp Navin = new Emp();
       
       Navin.eid = 8;
       Navin.salary = 50000;
       Emp.ceo = "Mahesh";
      //Navin.ceo = "Mahesh";
       
       Emp Rakesh = new Emp();	
       
       Rakesh.eid = 10;
       Rakesh.salary = 60000;
       Emp.ceo = "Mahesh";
      // Rakesh.ceo = "Nikita";
       
       Emp.ceo = "Nikita";
       
       Navin.show();
       Rakesh.show();
       
	}

}
