package Day1;

import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println("The number is Positive");
		}
		else if(n<0)
		{
			System.out.println("The number is Negative");
		}
		
		else
		{
			System.out.println("The number is Zero");
		}
	}

}
