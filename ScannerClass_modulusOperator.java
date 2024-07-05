package java_programs;

import java.util.Scanner;

public class ScannerClass_modulusOperator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner s1 = new Scanner(System.in);
        
        // Prompt the user to enter the value of a
        System.out.println("Enter Value of a:");
        int a = s1.nextInt();
        
        // Prompt the user to enter the value of b
        System.out.println("Enter Value of b:");
        int b = s1.nextInt();
        
        // Calculate the remainder of a divided by b
        int remainder = a % b;
        
        // Display the result
        System.out.println("Remainder: " + remainder);
        
        // Close the scanner
        s1.close();
    }
}
