
public class ArrayDemo 
 {
	public static void main (String[] args)
	{
		//int nums[] = {11,22,33,44,55}; // we can right in one line
		int nums[] = new int[4];
		nums[0] = 12;
		nums[1] = 13;
		nums[2] = 14;
		nums[3] = 15;
		
		
		for(int i = 0;i<4;i++)
		{
			System.out.println(nums[i]);
		}
	}

}
