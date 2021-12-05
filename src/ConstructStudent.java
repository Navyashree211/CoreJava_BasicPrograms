
public class ConstructStudent
{
	String name;
	int rollno;
	ConstructStudent(String name , int rollno)
	{
		this.name = name;
		this.rollno = rollno;
	}
	public static void main (String[] args)
	{
		ConstructStudent s1 = new ConstructStudent("durga",101);
		ConstructStudent s2 = new ConstructStudent("ravi",102);
		
		System.out.println(s1.name);
		System.out.println(s1.rollno);
		System.out.println(s2.name);
		System.out.println(s2.rollno);
	}

}
