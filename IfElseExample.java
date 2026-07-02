package arda.sahin.day2;

import java.util.Scanner;

public class IfElseExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your GPA: ");
        double gpa = input.nextDouble();

        if (gpa >= 3.50) {
            System.out.println("Excellent Student");
        } else if (gpa >= 2.50) {
            System.out.println("Successful Student");
        } else if (gpa >= 2.00) {
            System.out.println("Student Passed");
        } else {
            System.out.println("Student Failed");
        }

        input.close();
    }
}