import java.util.Scanner;

public class PlanetExploreApp {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		PlanetExplore e1 = new PlanetExplore();
		System.out.println("enter surface area of sphere");
		double s=scan.nextDouble();
		

		System.out.printf("%.2f",e1.calculateSurfaceArea(s));
	}

}
