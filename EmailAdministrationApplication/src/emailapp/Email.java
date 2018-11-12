package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength=10;
	private String department;
	private int mailboxCapacity=500;
	private String email;
	private String companySuffix= "anycompany.com";
	private String alternateEmail;
	
	
	// Constructor to receive first name and last name
	public Email(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println("New Employee: "+this.firstName+ " " +this.lastName);
		
		
		
		// Call a method asking for department - which returns the department
		this.department= setDepartment();
		//System.out.print("Department: " +this.department);
		
		
		
		
		// Call a method to create Random Password
		this.password= randomPassword(defaultPasswordLength);
		System.out.println();
		//System.out.print("Password: "+this.password);
		
		
		
		
		
		// Combine elements to generate email
		email= firstName.toLowerCase() + "." + lastName.toLowerCase() + "." + department + "@" + companySuffix;
		
		//System.out.println("Email generated: "+email);
		
		
	}
	
	// Ask for Department
	private String setDepartment() {
		System.out.print("\nEnter the Department Code: \n1 for sales \n2 for Development \n3 for Accounting \n0 for none \nEnter Department Code: ");
		Scanner s=new Scanner(System.in);
		int depChoice= s.nextInt();
		
		if(depChoice==1) {return "sales";}
		
		if(depChoice==2) {return "Dev";}
		
		if(depChoice==3) {return "Acconting";}
		
		{return "";}
		
			
		
	}
	
	
	
	// Generate random password
	private String randomPassword(int length) {
		
		String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password=new char[length];
		
		for(int i=0;i<length;i++) {
			int random=(int) (Math.random()* passwordSet.length());
			password[i]= passwordSet.charAt(random);
			
		}
		
		return new String(password);
		
	}
	
	// set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity=capacity;
	}
	
	// Ask for alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
		
	}
	
	// Change the password
	public void changePassword(String changedPassword) {
		this.password=changedPassword;
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public String getchangePassword() {
		return password;
	}
	
	public String showInfo() {
		System.out.println();
		System.out.println("Worker Details: ");
		
		
		return "NAME: "+ firstName + " " + lastName + 
				 "\nCOMPANY EMAIL: " + email +
				 "\nRandom generated Password: " + password +
				 "\nMAILBOX CAPACITY: " +mailboxCapacity;
		
	}
    
}
