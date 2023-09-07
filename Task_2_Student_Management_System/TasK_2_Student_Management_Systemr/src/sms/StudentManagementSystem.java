package sms;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
class StudentManagementSystem {
    private ArrayList<Student> students;
    private String storageFile;

    public StudentManagementSystem(String storageFile) {
        this.students = new ArrayList<>();
        this.storageFile =storageFile;
    }

    public void loadStudents() {
        try {
        	String storageFile = "E:\\Student Management System\\studentsInfo.txt"; // My FilePath.You can give Your FilePath here.
            BufferedReader br = new BufferedReader(new FileReader(storageFile));
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    students.add(new Student(data[0], data[1], data[2]));
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveStudents() {
    	String storageFile = "E:\\Student Management System\\studentsInfo.txt";  // My FilePath.You can give Your FilePath here.
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(storageFile));
            for (Student student : students) {
                bw.write(student.getName() + "," + student.getRollNumber() + "," + student.getGrade() + "\n");
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addStudent(String name, String rollNumber, String grade) {
        students.add(new Student(name, rollNumber, grade));
        saveStudents();
    }

    public void removeStudent(String rollNumber) {
        students.removeIf(student -> student.getRollNumber().equals(rollNumber));
        saveStudents();
    }

    public Student searchStudent(String rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber().equals(rollNumber)) {
                return student;
            }
        }
        return null;
    }

//    public Student displayAllStudents() {
//        for (Student student : students) {
//            System.out.println("Name: " + student.getName() + ", Roll Number: " + student.getRollNumber() + ", Grade: " + student.getGrade());
//            return student;
//        }
//		return null;
//       
//    }
//   
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("List of Students:");
            for (Student student : students) {
                System.out.println("Name: " + student.getName() + ", Roll Number: " + student.getRollNumber() + ", Grade: " + student.getGrade());
            }
        }
    }

    
}