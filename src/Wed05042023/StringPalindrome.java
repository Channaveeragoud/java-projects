package Wed05042023;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Characters");
		String s=sc.next();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
       System.out.println("The Reverse Character is:"+ rev);
       if(s.equals(rev))
       {
    	   System.out.println("its a palindrome string");
       }
       else
       {
    	   System.out.println("its not a palindrome string");
       }
	}

}
