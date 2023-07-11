
public class SumDigit {
	public static void main(String[] args) {
		int num=13456;
		int sum=0;
		int tempNumber=num;
		while(tempNumber>0) {
			int digit=tempNumber;
			sum=sum+digit;
			tempNumber/=10;
		}
		System.out.println("Sum of digits in " + num + ": " + sum);
	}

}
