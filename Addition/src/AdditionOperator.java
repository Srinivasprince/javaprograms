import java.util.Scanner;

public class AdditionOperator {
	public static void main(String[] args) {
		
		int res=subtractNumbers(20,5);
		
		System.out.println("sub res:"+res);
		
		int res1=multiplyNumbers(4,5);
		System.out.println("mulres:"+res1);
		double res2=divisionNumbers(20,4);
		System.out.printf("%.2f\n",res2);
		int res3=remainderNumbers(10,3);
		System.out.println(res3);
		
	}
	
	public static int subtractNumbers(int num1,int num2){
		return num1-num2;
		
		
	}
	public static int multiplyNumbers(int num1,int num2){
		return num1*num2;
	
	}
	public static double divisionNumbers(int num1,int num2){
		return num1/num2;
	
	}
		public static int remainderNumbers(int num1,int num2){
			return num1%num2;
	}
	}
	

