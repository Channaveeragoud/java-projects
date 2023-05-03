package Day1;

import java.util.Scanner;

public class OldestYoungest {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age of 1st Person");
		int p1=sc.nextInt();
		System.out.println("Enter Age of 2nd Person");
		int p2=sc.nextInt();
		System.out.println("Enter Age of 3rd Person");
		int p3=sc.nextInt();
		
		/*if(p1>p2 && p1>p3)
		{
			System.out.println("The p1 oldest person is:"+" "+p1);
		}
		else if(p2>p1 && p2>p3)
		{
			System.out.println("The p2 oldest person is:"+" "+p2);
		}
		else
		{
			System.out.println("The p3 oldest person is:"+" "+p3);
		}
		if(p1<p2 && p1<p3)
		{
			System.out.println("The p1 youngest person is:"+" "+p1);
		}
		else if(p2<p1 && p2<p3)
		{
			System.out.println("The p2 youngest person is:"+" "+p2);
		}
		else
		{
			System.out.println("The p3 youngest person is:"+" "+p3);
		}*/
			
		int oldest=p3>(p1>p2?p1:p2)?p3:(p1>p2?p1:p2);
		System.out.println("The oldest is:"+oldest);
		int youngest=p3<(p1<p2?p1:p2)?p3:(p1<p2?p1:p2);
		System.out.println("The youngest is:"+youngest);
	}

}
