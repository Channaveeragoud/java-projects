package Day1;

import java.util.Random;

public class RandomNumberAndString {

	public static void main(String[] args) 
	{
		Random rand=new Random();
		int num=rand.nextInt(50);
		System.out.println(num);
		double db=rand.nextDouble();
		System.out.println(db);
		
	}

}
