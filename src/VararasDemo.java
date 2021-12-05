class Calce
{
	public int add(int ... n)
	{
		int sum = 0;
		for(int i : n)
		{
			sum = sum + i;
			
		}
		return sum;
		
	}
}

public  class VararasDemo  
   {
       public static void main (String[] args)
       {
    	   Calce Obj = new Calce();
    	   
    	   System.out.println(Obj.add(11,22,55,13,4,2,15,15,13,6,8,811));
       }
   }
