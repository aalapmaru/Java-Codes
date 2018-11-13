package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		// Ask how many new users we to add
		System.out.print("Enter the number of students to add: ");
		int numberOfStudents=s.nextInt();

		Student[] student=new Student[numberOfStudents];



		// Create a number of new students
		for(int i=0; i<student.length;i++) {
			student[i]=new Student();
			student[i].Enroll();
			student[i].payTuition();
		}
		System.out.println();
		System.out.print("Below are all the student details ");

		for(int i=0;i<student.length;i++) {
			System.out.println();
			System.out.println("Student " +(i+1)+ " details: "+student[i].showInfo());
			System.out.println();
		}

	}

}
