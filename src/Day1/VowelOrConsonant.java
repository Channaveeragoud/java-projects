package Day1;

public class VowelOrConsonant {

	public static void main(String[] args) 
	{
		char c='a';
		if((c=='A'||c=='E'||c=='I'||c=='O'||c=='U')||(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'))
		{
			System.out.println("The character is Vowel");
		}
		else
		{
			System.out.println("The character is Consonant");
		}
	}

}
