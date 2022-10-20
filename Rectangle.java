package userinput;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		 
		 int l,b;
		 
		 Scanner sc=new Scanner(System.in);
		//user input
			System.out.println("Enter the length :");
           l= sc.nextInt();
            System.out.println("Enter the breadth :");
            b=sc.nextInt();
            
            
            //display
    
           int area=l*b;
            System.out.println("The area of rectangle of length="+l+" and breadth="+b+" is "+area);
            
                 
            
	}

}
