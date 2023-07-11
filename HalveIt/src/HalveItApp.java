import java.util.Scanner;

public class HalveItApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		double num=scan.nextDouble();
		HalveIt h1=new HalveIt();
		System.out.printf("%.2f",h1.halveTheNumber(num));
		
		
	}

}
