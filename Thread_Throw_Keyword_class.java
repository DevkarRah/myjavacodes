package java_programs;

public class Thread_Throw_Keyword_class 
{
	public static void main(String[] args) throws NullPointerException, InterruptedException
	{
		System.out.println("Rahul");
		Thread.sleep(3000);
		System.out.println("Student");
		throw new NullPointerException("Sorry the cell is empty");
		
		
	}
}
