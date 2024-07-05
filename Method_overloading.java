package java_programs;

public class Method_overloading 

{
static void add(int a)// 1 Parameter
{
	int sum = a+6;
	System.out.println(sum);
}
static void add(int a,int b)// 2 Parameter
{
	int sum = a+b+6;
	System.out.println(sum);
}
static void add(double a)// 0 Parameter
{
	double sum = a+6;
	System.out.println(sum);
}
static void add(int a, double b, double c)// 0 Parameter
{
	double sum = a+b+c+6;
	System.out.println(sum);
}

public static void main(String[] args) 
{
	add (100);
	add (100,200);
	add (2.23);
	add (11,2.23,5.6);
}
}
