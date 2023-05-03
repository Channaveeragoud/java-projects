package Pyramid;

import java.util.Scanner;

public class SumOfDigits {
	public static int sumofdigits(int n)
	{
		int sum=0;
		while(n>0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		if(sum>9)
		{
			n=sum;
		return sumofdigits(n);
		}
		else 
			return sum;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the Number");
		int n=sc.nextInt();
		
		int result=sumofdigits(n);
		System.out.println(result);

	}

}
