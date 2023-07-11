import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int num=scan.nextInt();
		int res=squareNumber(num);
		System.out.println(res);
	}
	public static int squareNumber(int num) {
		return num*num;
	}

}
