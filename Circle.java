package userinput;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		 int r;
         double pi;
		  Scanner sc=new Scanner(System.in);
		  
		//user input
			System.out.println("Enter the radius :");
           r= sc.nextInt();
           System.out.println("Enter the pi value :");
           pi=sc.nextDouble();
            
            
            //display
    
           double area=pi*r*r;
            System.out.println("The area of circle of radius="+r+"  is "+area);
            
	}

}
