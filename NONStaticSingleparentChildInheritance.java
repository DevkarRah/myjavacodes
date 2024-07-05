package java_programs;



class ParentClass1
{
     void add() 
    {
        System.out.println("A");
    }
}

public class NONStaticSingleparentChildInheritance extends ParentClass1
{
     void sub() 
    {
        System.out.println("B");
    }

    public static void main(String[] args) 
    
    {
    	NONStaticSingleparentChildInheritance n1 = new NONStaticSingleparentChildInheritance();
    	
        n1.add(); // Calling the parent class method
        n1.sub(); // Calling the child class method
    }
}




