package java_programs;

public class Method_overloding_nonstatic 


{
	
void add(int a) 
{
	int sum = a+6;
	System.out.println(sum);
}

void add(int a,int b) 
{
	int sum = a+b+6;
	System.out.println(sum);
}

void add(double a) 
{
	double sum = a+6;
	System.out.println(sum);
}
	
void add(int a,double b,double c) 
{
	double sum = a+b+c+6;
	System.out.println(sum);
}
	
public static void main(String[] args) 
{
	
System.out.println("RAHUL");	
Method_overloding_nonstatic m1 = new Method_overloding_nonstatic();

m1.add(100); 
m1.add(100,200);
m1.add(3.56);
m1.add(100, 3.50, 4.599);


}	
	
}
