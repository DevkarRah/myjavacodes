package java_programs;

import java.util.Arrays;
import java.util.jar.Attributes.Name;

public class StringFunctionEndswithAndContains 
{
public static void main(String[] args) 
{

	
			String name = "Constitution is pillar of Democracy";
			boolean answer = name.contains ("is"); //// 5 is d character
			System.out.println(answer );
			
			boolean answer1 = name.endsWith("pillar"); //// 5 is d character
			System.out.println(answer1 );
			
			String s1 = "50cent";
			char c1[] = s1.toCharArray();
			System.out.println(Arrays.toString(c1));
			
			boolean b1 = Character.isDigit(c1[1]);
			System.out.println(b1);
	
	for (int i = 0;i<s1.length();i++)
		
	{
		boolean b11 = Character.isDigit(c1[i]);
		System.out.println(b11);
	}
	}
}

