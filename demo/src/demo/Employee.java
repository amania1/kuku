package demo;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name ;
int age;
double salary ;

Scanner s = new Scanner(System.in);
System.out.println("Enter your name");
name = s.nextLine();

System.out.println("Enter your age");
age = s.nextInt();


System.out.println("enter your salery");
	salary = s.nextDouble();	


s.close();
		
	}

}
