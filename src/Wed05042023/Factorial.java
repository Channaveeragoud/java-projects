package Wed05042023;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int j=1;
		for(int i=1;i<=n;i++)
		{
			j=j*i;
		}
			
		System.out.println("The factorial of the given number is"+" "+j);

	}

}
