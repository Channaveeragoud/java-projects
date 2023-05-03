package Wed05042023;

import java.util.Scanner;

public class AreaOfCircleRectangle {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Area of Circle
		
		System.out.println("Enter the Radius");
		int r=sc.nextInt();
		double circle=3.14*r*r;
		System.out.println("Area of Cirlce is"+" "+circle);
		
		
//Area of Rectangle
		System.out.println("Enter the length");
		int l=sc.nextInt();
		System.out.println("Enter the Width");
		int w=sc.nextInt();
		int rect=l*w;
		System.out.println("Area of Rectangle is"+" "+rect);
		
		//Area of Square
		System.out.println("Enter the area");
		int a=sc.nextInt();
		int sqr=a*a;
		System.out.println("Area of Square is"+" "+sqr);
		// Area of traingle
		System.out.println("Enter the length valu");
		int len=sc.nextInt();
		System.out.println("Enter the height value");
		int h=sc.nextInt();
		double tri=0.5*len*h;
		System.out.println("Area of Triangle is"+" "+tri);
		
		
	}

}
