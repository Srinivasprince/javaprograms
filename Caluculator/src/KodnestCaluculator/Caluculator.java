package KodnestCaluculator;

import java.util.Scanner;

public class Caluculator {

	Scanner scan=new Scanner(System.in);
	
	void add() {
		System.out.println("enter two numbers ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a+b);
		
	}
	void  sub() {
		System.out.println("enter two numbers ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(b-a);
	}
		
	void  mul() {
		System.out.println("enter two numbers ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a*b);
		
	}
	void rem() {
		System.out.println("enter two numbers ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a%b);
	}
	void div() {
		System.out.println("enter two numbers ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a/b);
		
	}
	void findSquare() {
		System.out.println("enter a number");
		int a=scan.nextInt();
		System.out.println((a*a));
	}
	
		
		
		
	
	

}
