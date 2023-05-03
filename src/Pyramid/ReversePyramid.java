package Pyramid;

public class ReversePyramid {

	public static void main(String[] args)
	{
		int n=10;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<n-1*i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n-i;k>=0;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
