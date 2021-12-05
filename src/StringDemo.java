import java.util.Scanner;

public class StringDemo 
{

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String ");
		String str = sc.nextLine();
		int initialLength = str.length();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the character to find the occurance");
		String str1 = sc1.next();
		str = str.replace(str1 , " ");
		int FinalLength = str.length();
		System.out.println(" totel number of occurences of charater " + str1 + " " + (initialLength - FinalLength));
	}
}
