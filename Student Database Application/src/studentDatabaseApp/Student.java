package studentDatabaseApp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses="";
	private int tuitionBalance=0;
	private int costOfCourse=600;
	private static int id=1000;



	// Constructor for student name and year
	public Student() {
		Scanner s=new Scanner(System.in);
		System.out.println();
		System.out.print("Enter Student's First Name: ");
		this.firstName=s.nextLine();

		System.out.print("Enter Student's Last Name: ");
		this.lastName=s.nextLine();
		System.out.println();

		System.out.print("1 - For Freshmen\n2 - For Sophomore\n3 - For Junior\n4 - For Senior\nEnter class level: ");
		this.gradeYear=s.nextInt();

		setStudentId();

		//System.out.println(firstName+ " " +lastName+ " " +gradeYear+ " "+studentId);

	}

	// Generate unique ID
	private void setStudentId() {
		id++;
		this.studentId= gradeYear + "" + id;


	}

	// Enroll in courses
	public void Enroll() {
		do {
			System.out.print("Enter course to enroll in " +  "(Press " + "Q" + " to Quit ): ");
			Scanner s=new Scanner(System.in);

			String course= s.nextLine();

			if((!course.equals("Q")) && (!course.equals("q"))) {

				if(courses.equals(null)) {
					tuitionBalance=0;
					courses= courses + "none taken";
				}


				else {
					courses=courses + "\n " + course;
					tuitionBalance+=costOfCourse;
				}
			}else {

				break;
			}

		}while(1!=0);
		//System.out.println("Courses selected: "+courses);
		System.out.println();

	}


	// View Balance and Tuition
	public void viewBalance() {
		System.out.print("Your balance is: $"+tuitionBalance);
		System.out.println();
	}

	//pay tuition
	public void payTuition() {
		viewBalance();
		Scanner s=new Scanner(System.in);
		System.out.println();
		System.out.print("Enter the amount to be paid: $");
		int payment=s.nextInt();

		tuitionBalance=tuitionBalance-payment;
		System.out.println();
		viewBalance();
	}

	// Show Status
	public String showInfo() {

		return "\nName: " + firstName + " " + lastName +
				"\nGrade Level: " +gradeYear +
				"\nStudent id: " +studentId +
				"\nCourses: " + courses +
				"\nBalance: " +tuitionBalance;




	}
}
