package sms;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String storageFile = "E:\\Student Management System\\studentsInfo.txt";
        StudentManagementSystem sms = new StudentManagementSystem(storageFile);
        sms.loadStudents();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine(); 

            if (choice.equals("1")) {
                System.out.print("Enter student's name: ");
                String name = scanner.nextLine();
                System.out.print("Enter student's roll number: ");
                String rollNumber = scanner.nextLine();
                System.out.print("Enter student's grade: ");
                String grade = scanner.nextLine();
                sms.addStudent(name, rollNumber, grade);
                System.out.println("Student added successfully.");
            } else if (choice.equals("2")) {
                System.out.print("Enter the roll number of the student to remove: ");
                String rollNumber = scanner.nextLine();
                sms.removeStudent(rollNumber);
                System.out.println("Student removed successfully.");
            } else if (choice.equals("3")) {
                System.out.print("Enter the roll number of the student to search: ");
                String rollNumber = scanner.nextLine();
                Student student = sms.searchStudent(rollNumber);
                if (student != null) {
                    System.out.println("Name: " + student.getName() + ", Roll Number: " + student.getRollNumber() + ", Grade: " + student.getGrade());
                } else {
                    System.out.println("Student not found.");
                }
            } else if (choice.equals("4")) {
            // Student student =   
            		 sms.displayAllStudents();
//             if (student == null) {
//            	 System.out.println("No Students to display");
//             }
            		 
//                
            } 
            
            else if (choice.equals("5")) {
            	 System.out.println("Thank you for using the Student Management System. Goodbye!");
                break;
            }
            else {
            	System.out.println(" ");
            	System.out.println("Invalid Choice. Please Enter Valid Option.!");
            }
        }

        scanner.close();
        
    }
}


