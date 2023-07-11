import java.util.Scanner;

public class SemMarks {
	public static void main(String[] args) {
		Scanner  scan=new Scanner(System.in);
		System.out.println("enter sem marks");
		int s1=scan.nextInt();
		int s2=scan.nextInt();
		int s3=scan.nextInt();
		int s4=scan.nextInt();
		int s5=scan.nextInt();
		int s6=scan.nextInt();
		int s7=scan.nextInt();
		int s8=scan.nextInt();
		
		 double res=calculateAverage(85, 79, 91, 76, 88, 95, 80, 85);
		System.out.printf("%.2f",res);
	}
	public static double calculateAverage(int sem1, int sem2, int sem3, int sem4, int sem5, int sem6, int sem7, int sem8) {
		return (85+79+91+76+88+95+80+85)/8.0;
	}

}

