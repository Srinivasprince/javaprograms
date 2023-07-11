import java.util.Scanner;

public class HeightConverterApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		HeightConverter converter = new HeightConverter();
		System.out.println(" enter inches");
		double inch=scan.nextDouble();

		System.out.printf("%.2f",converter.convertInchesToFeet(inch));
	}

}
