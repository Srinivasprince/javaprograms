import java.util.Scanner;

public class TimeCoverterApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println(" enter the time in min");
	int min=scan.nextInt();
	TimeConverter c1=new TimeConverter();
	System.out.printf("%.1f",c1.convertToHours(min));
	
	
}
}
