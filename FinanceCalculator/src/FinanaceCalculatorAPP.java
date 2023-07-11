import java.util.Scanner;

public class FinanaceCalculatorAPP {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);

	FinanceCalculator calculator = new FinanceCalculator();
	System.out.println(" enter interest");
	double principal = scan.nextDouble();
    double rate =scan.nextDouble();
    double time =scan.nextDouble();

	System.out.printf("%.2f",calculator.calculateSimpleInterest(principal,rate,time));

}
}
