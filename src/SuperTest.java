class Q
{
	int i = 10;
	int j = 20;
}

class R extends Q
{
	 int i = 30;
	 int j = 40;
	 
	 R(int i , int j)
	 {
		 System.out.println(i+ "  " +j);    //local class level
		 System.out.println(this.i+ "  " +this.j);  //current class level
		 System.out.println(super.i+ "  " +super.j);  //super class level
		 
	 }
}
public class SuperTest
 {
    public static void main (String[] args)
    {
    	R r = new R (50 , 60);
    }
}
