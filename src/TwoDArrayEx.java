
public class TwoDArrayEx 
 {
	public static void main (String[] args)
	{
		int a[] = {1,2,3,4};
		int b[] = {2,4,6,8};
		int c[] = {3,6,9,12};
						
		int d[][] = {                                 //jagged Array
				      {1,2,3,4},
				      
				      {2,4,6}, // {2,4,6,8},     
				      
				      {3,6,9,12}
			};
		//for(int i = 0;i<3;i++) 
		
		for(int i = 0;i<d.length;i++)
		{
			 //for(int j = 0;j<4;j++) 
			
			for(int j = 0;j<d[i].length;j++)
			{
				System.out.println(" " + d[i][j]);
			}
			System.out.println();
		}
	
	}

}
