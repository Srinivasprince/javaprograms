import java.util.Scanner;

public class SumOfDigitApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a  sum of number ");
	int num=scan.nextInt();
	SumOfDigits s1=new SumOfDigits();
	
	
	System.out.println(s1.sum(num));
	
	
	
}

}
