package userinput;

import java.util.Scanner;

public class Square {
	
	public static void main(String[] args) {
		 
		 int a;
		 
		 Scanner sc=new Scanner(System.in);
		//user input
			System.out.println("Enter the Radius :");
          a= sc.nextInt();
          
           
           //display
   
          int area=a*a;
           System.out.println("The area of sqaure with length="+a+"  is "+area);

}
}