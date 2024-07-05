package java_programs;

class ParentClass {
    static void add() 
    {
        System.out.println("A");
    }
}

public class SingleChildClassInheritance extends ParentClass 
{
    static void sub() 
    {
        System.out.println("B");
    }

    public static void main(String[] args) 
    {
        add(); // Calling the parent class method
        sub(); // Calling the child class method
    }
}
