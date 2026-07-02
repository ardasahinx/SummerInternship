package arda.sahin.day3;

import java.util.Scanner;

public class LoopExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter GPA: ");
        double gpa = input.nextDouble();

        System.out.println();
        System.out.println("Student: " + name);
        System.out.println("GPA: " + gpa);
        System.out.println("---------------------");

        for (int i = 1; i <= 3; i++) {

            System.out.println("Result " + i);

            if (gpa >= 2.00) {
                System.out.println(name + " passed the course.");
            } else {
                System.out.println(name + " failed the course.");
            }

            System.out.println();
        }

        System.out.println("Process Finished.");

        input.close();
    }

}
