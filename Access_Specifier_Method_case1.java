package java_programs;

public class Access_Specifier_Method_case1 
{
public void add() {System.out.println("A");}
private void sub() {System.out.println("B");}
protected void mul() {System.out.println("C");}
void divide() {System.out.println("D");}

public static void main(String[] args) 
{
	Access_Specifier_Method_case1 a1= new Access_Specifier_Method_case1();
	a1.add();
	a1.sub();
	a1.mul();
	a1.divide();
}


}
