package string_Permutation;

import java.util.Scanner;

public class permutation {

	public static void main(String args[])
	{
         Scanner in=new Scanner(System.in);
         System.out.println("Print your string");
         String str=in.next();
         
         permutations(str, "");
	}

	public static void permutations(String givenString, String currentString)
	{
		if(givenString.length()==0)
		{
			System.out.println(currentString);
			return;
		}

		for(int i=0; i<givenString.length(); i++)
		{
			char ch=givenString.charAt(i);
			
			String leftOfcurrentChar=givenString.substring(0, i);
			String rightOfcurrentChar=givenString.substring(i+1);
			String remString= leftOfcurrentChar+rightOfcurrentChar;
			
			permutations(remString, currentString+ch);
			
			
		}
	}
}
