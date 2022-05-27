package com.student;

import java.util.Scanner;

public class scann {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstname;

		Scanner s = new Scanner(System.in);

		System.out.println("inter your first name");
		firstname = s.nextLine();
		System.out.println("welcome : " + firstname);

		int a;

		int b;

		Scanner input = new Scanner(System.in);
		System.out.println("inter your first number");
		a = input.nextInt();
		System.out.println("inter your second number");
		b = input.nextInt();
		System.out.println("the some of your number is (a+b)");
		s.nextLine();

	}

}
