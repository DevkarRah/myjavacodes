package java_programs;

import java.util.Scanner;

public class ScannerClass_Area_of_rectangle {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner s1 = new Scanner(System.in);

        // Prompt the user to enter the length of the rectangle
        System.out.println("Enter length:");
        int length = s1.nextInt();
        
        // Prompt the user to enter the width of the rectangle
        System.out.println("Enter width:");
        int width = s1.nextInt();
        
        // Calculate the area of the rectangle
        double area = length * width;
        
        // Display the result
        System.out.println("Area of Rectangle: " + area);
        
        // Close the scanner
        s1.close();
    }
}
