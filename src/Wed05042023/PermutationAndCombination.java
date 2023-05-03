package Wed05042023;

public class PermutationAndCombination 
{
	static int factorial(int n) {
	   int fact = 1;
	      int i = 1;
	      for(i=1;i<n;i++)
	      {
	    	  fact=fact*i;
	      }
	      return fact;
	   }
	   public static void main(String args[])
	   {
	      int n = 6, r = 3, comb, per;
	      per = factorial(n) / factorial(n-r);
	      System.out.println("Permutation: " + per);
	      comb = factorial(n) / (factorial(r) * factorial(n-r));
	      System.out.println("Combination: " + comb);
	   }
}

