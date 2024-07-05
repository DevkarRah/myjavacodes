package java_programs;

import java.util.IllegalFormatCodePointException;
public class Throw_Keyword_class 
{
	public static void main(String[] args) throws NullPointerException, InterruptedException
	{
		System.out.println("Rahul");
		Thread.sleep(3000);
		System.out.println("A");
		throw new NullPointerException("Sorry the cell is empty");
		
		
	}
}
