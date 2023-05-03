package Wed05042023;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first Number");
	int a=sc.nextInt();
	System.out.println("Enter the Second Number");
	int b=sc.nextInt();
	int add,sub,mul;
	double div,mod;
	add=a+b;
	sub=a-b;
	System.out.println("Addition is"+" "+add);
	System.out.println("Substraction is"+" "+sub);
	if(b!=0)
	{
	mul=a*b;
	div=a/b;
	mod=a%b;
	System.out.println("Multiplication is"+" "+mul);
	System.out.println("Division is"+" "+div);
	System.out.println("Modulus is"+" "+mod);
	}
	else {
		System.out.println("b value is invalid");
	}
	
	
	
	
	}

}
