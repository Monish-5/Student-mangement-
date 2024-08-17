package org.Studentdatebase;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;;
	private String courses;
	private int tuitionBalance;
	private static int costOfCourse =600;
	private static int id=100;
	
	
	public Student() {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName=in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName=in.nextLine();
		
		System.out.println("1 -Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear=in.nextInt();
		setStudentID();
		System.out.println(firstName +" "+lastName +" "+gradeYear +" "+studentID);
		
	
	}
	private void setStudentID() {
		id++;
		this.studentID = gradeYear + "" + id;
	}
      public void enroll() {
    	do {
    		System.out.println("Enter course to enroll (Q to quit): ");
    	
    	  Scanner in=new Scanner(System.in);
    	 String course=in.nextLine();
    	 if(!course.equals("Q")){
    	
    		 courses = courses +"\n"+course;
    		 tuitionBalance =tuitionBalance + costOfCourse;
    	 }
    	 else {
    		
    	    		 break;
    		 }
      }
      while (1 !=0);
      
    
      }
      public void viewBalance() {
    	  System.out.println("YOUR BALANCE IS :$"+tuitionBalance);
    	  
      }
      public void payTuition() {
    	  viewBalance();
    	  System.out.println("Enter your payment : $");
    	  Scanner in =new Scanner(System.in);
    	  int payment =in.nextInt();
    	  tuitionBalance=tuitionBalance - payment;
    	  System.out.println("Thank you for your payment of $"+payment);
    	  viewBalance();
    	  
      }
      public String showInfo() {
    	  return "Name: "+firstName + " "+lastName+
    			  "\ngrade Level: "+gradeYear +
    			  "\nCourses Enrolled:" + courses  +
    			  "\nBalance: $" +  tuitionBalance;
      }
}

