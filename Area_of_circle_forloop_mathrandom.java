package java_programs;

public class Area_of_circle_forloop_mathrandom 
{
	static double pi_val=Math.PI;
public static void main(String[] args) 

{
	for (int i=1; i<=5;i++)
	{
		double r = Math.random();
		double area = pi_val*r*r;
	System.err.println("Area of circle is -->"+ area);
	}
}
}
