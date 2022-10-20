package userinput;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int b,h;
		 Scanner sc=new Scanner(System.in);
			//user input
				System.out.println("Enter the base :");
	           b= sc.nextInt();
	            System.out.println("Enter the height :");
	            h=sc.nextInt();
	            
	            
	            //display
	    
	           int area=(b*h)/2;
	            System.out.println("The area of Triangle of length="+b+" and breadth="+h+" is "+area);
	            
	}

}
