package java_programs;

// Grandparent class with two concrete methods
class Delhi2 {
    void mul11() {
        System.out.println("mul");
    }

    void div11() {
        System.out.println("div");
    }
}

// Parent class which is abstract and extends the grandparent class
abstract class Mumbai2 extends Delhi2 {
    // Abstract methods
    abstract void mul1();
    abstract void division();

    // Concrete methods
    void add12() {
        System.out.println("add");
    }

    void sub12() {
        System.out.println("sub");
    }
}

// Child class that extends the abstract parent class and provides implementations for the abstract methods
public class AbstractConcretemethod2 extends Mumbai2 {
    // Static methods in the child class
    static void add() {
        System.out.println("Adition");
    }

    static void div() {
        System.out.println("Division");
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Calling static methods
        add();
        div();

        // Creating an instance of the child class
        AbstractConcretemethod2 a1 = new AbstractConcretemethod2();

        // Calling concrete methods from the parent and grandparent classes
        a1.add12();
        a1.sub12();
        a1.mul11();
        a1.div11();

        // Calling implemented abstract methods
        a1.mul1();
        a1.division();
    }

    // Implementing abstract methods from the parent class
    void mul1() {
        System.out.println("Implemented mul1");
    }

    void division() {
        System.out.println("Implemented division");
    }
}
