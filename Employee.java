package userinput;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		String ename;
		int eage;
		float esalary;
		String edept;
	
		//user input
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the employee name :");
		ename=sc.nextLine();
		System.out.println("enter the employee age :");
		eage=sc.nextInt();
		System.out.println("enter the employee salary :");
	   esalary=sc.nextFloat();
		System.out.println("enter the employee department :");
		edept=sc.next();
		
		
		//display
		double eyearsalary =esalary*12;
		System.out.println("employee name ="+ename);
		System.out.println(" employee age :"+eage);
		System.out.println("employee salary :"+esalary);
		System.out.println("employee dept :"+edept);
		System.out.println("employee year salary :"+eyearsalary);
		
	}

}
