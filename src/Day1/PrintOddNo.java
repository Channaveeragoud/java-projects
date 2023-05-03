package Day1;

public class PrintOddNo {

	public static void main(String[] args) 
	{
		int num=125874;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2!=0)
			{
				System.out.println(rem);
			}
			num=num/10;
		}
		
	}

}
