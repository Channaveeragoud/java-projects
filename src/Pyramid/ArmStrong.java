package Pyramid;

import java.util.Scanner;

public class ArmStrong 
{
	public static int comuptePower(int a,int l)
	{
		int c=1;
		for(int i=0;i<l;i++)
		{
			c=c*a;
		}
		return c;
	}

	
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Eneter the Number");
	int n=sc.nextInt();
	int temp=n;
	int length=0;
	int output=0;
	
	while(temp>0)
	{
		temp=temp/10;
		length++;
	}
	System.out.println("length is:"+length);
	temp=n;
	while(temp>0)
	{
		output=output+comuptePower(temp%10,length);
		temp=temp/10;
		
	}
	System.out.println(output);
	if(output==n)
		System.out.println("The number is ArmStrong");
	else
		System.out.println("The number is not ArmStrong");
		

	}

}
