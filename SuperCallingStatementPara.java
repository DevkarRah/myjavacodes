package java_programs;

class SetURL 
{
    // Constructor with an integer parameter
    SetURL(int age) 
    {
        System.out.println("set_URL");
    }
}

class LaunchTheBrowser extends SetURL 
{
    // Constructor with a string parameter
    LaunchTheBrowser(String Google_Chrome) 
    {
        // Call to the superclass constructor with an integer argument
        super(90);
        System.out.println("Launch_the_browser");
    }

	
}

public class SuperCallingStatementPara extends LaunchTheBrowser 
{
    // Default constructor
    SuperCallingStatementPara() 
    {
        // Call to the superclass constructor with a string argument
        super("RAHULDEVKAR");
        System.out.println("TestCase1");
    }

    public static void main(String[] args) 
    {
        // Create an instance of SuperCallingStatementPara
        SuperCallingStatementPara s1=new SuperCallingStatementPara();
    }
}
