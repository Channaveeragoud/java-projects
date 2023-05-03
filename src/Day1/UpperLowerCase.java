package Day1;

import java.util.Scanner;

public class UpperLowerCase {

	public static void main(String[] args)
	{
		char c='D';
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character");
		String c=sc.next();*/
		{
			if(c>='A' && c<='Z')
				System.out.println("The character is Uppaercase"+" "+c);
			else //if(c>='a'&& c<='z')
				System.out.println("The character is Lowercase"+" "+c);
		}
		
		
	}

}
