package java_programs;

class setURL

{
	setURL ()
	{
		System.out.println("set_URL");
	}	
}

class LaunchTheBrowser extends setURL

{
	LaunchTheBrowser()
	{
		
		System.out.println("Launch_the_browser");
	}
}


public class SuperCallingStatement extends LaunchTheBrowser 

{
	
	SuperCallingStatement()
	{
		
	System.out.println("TestCase1");
	}
	
	public static void main(String[] args) 
	{
		SuperCallingStatement s1 = new SuperCallingStatement();
//		s1.Launch_the_browser();
//		s1.set_URL();
	}
}
