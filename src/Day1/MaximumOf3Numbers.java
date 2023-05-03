package Day1;

public class MaximumOf3Numbers {

	public static void main(String[] args) 
	{
		int a=50;
		int b=35;
		int c=65;
		
		int max=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println("The Maximum of 3 Number is:"+" "+max);
		

	}

}
