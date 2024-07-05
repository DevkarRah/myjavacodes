package java_programs;

public class Global_Program 
{        
	   static double pi=3.14;
       //String static name ="Manish";/////Global variable
       
       static void area()
       {  int r=7;
    	   double area=pi*r*r;
    	   System.out.println(area);
       }
       
		public static void main(String[] args) 
		{
			//String name="Ekta";/// Local variable
			int r=10;
			double area=pi*r*r;
			
		    System.out.println(area);	
		    area();
		}
}
