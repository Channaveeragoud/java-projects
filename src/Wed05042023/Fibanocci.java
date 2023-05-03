package Wed05042023;

import java.util.Scanner;

public class Fibanocci {

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int first=0;
		int second=1;
		int third=0;
		System.out.println(first);
		System.out.println(second);
		for(int i=2;i<=n;i++)
		{
			third=first+second;
			System.out.println(third);
			first=second;
			second=third;
			
		}
		}
		

}
