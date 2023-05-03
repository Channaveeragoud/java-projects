package Day1;

import java.util.Scanner;

public class PercentageAndGrade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter P Marks");
		int P=sc.nextInt();
		System.out.println("Enter C Marks");
		int C=sc.nextInt();
		System.out.println("Enter M Marks");
		int M=sc.nextInt();
		System.out.println("Enter CS Marks");
		int CS=sc.nextInt();
		
		int tot=P+C+M+CS;
		System.out.println("Total Marks is"+" "+tot);
		double per=tot/4;
		System.out.println("Total Percentage is"+" "+per);
		if(P>=35 && C>=35 && M>=35 && CS>=35 )
		{
		
		if(per>=90 && per<=100)
		{
			System.out.println("Grade is A");
		}
		else if(per>=80 && per<=90)
		{
			System.out.println("Grade is B");
		}
		else if(per>=70 && per<=80)
		{
			System.out.println("Grade is C");
		}
		else if(per>=60 && per<=70)
		{
			System.out.println("Grade is D");
		}
		else if(per>=40 && per<=60)
		{
			System.out.println("Grade is E");
		}
		}
		else
		{
			System.out.println("Grade is F");
		}
		
		

	}

}
