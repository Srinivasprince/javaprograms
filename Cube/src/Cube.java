import java.util.Scanner;

public class Cube {


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int num=scan.nextInt();
		int res=cubeNumber(num);
		System.out.println(res);
	}
	public static int cubeNumber(int num) {
		return num*num*num;
	}

}


