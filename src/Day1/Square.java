package Day1;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length value");
		int len=sc.nextInt();
		System.out.println("Enter breadth value");
		int brt=sc.nextInt();
		if(len==brt)
		{
			System.out.println("its a Square");
		}
		else {
			System.out.println("its not a Square");
			
		}
		
		

	}

}
