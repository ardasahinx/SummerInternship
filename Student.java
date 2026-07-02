package arda.sahin.day1;

public class Student {

    String name;
    String surname;
    String email;
    String department;

    int studentNumber;
    int age;
    int year;

    double gpa;

    public static void main(String[] args) {

        Student arda = new Student();

        arda.name = "Arda";
        arda.surname = "Sahin";
        arda.email = "230504545@st.atlas.edu.tr";
        arda.department = "Software Engineering";
        arda.studentNumber = 230504545;
        arda.age = 20;
        arda.year = 2;
        arda.gpa = 2.20;

        System.out.println("Name: " + arda.name);
        System.out.println("Surname: " + arda.surname);
        System.out.println("Email: " + arda.email);
        System.out.println("Department: " + arda.department);
        System.out.println("Student Number: " + arda.studentNumber);
        System.out.println("Age: " + arda.age);
        System.out.println("Year: " + arda.year);
        System.out.println("GPA: " + arda.gpa);

    }

}

