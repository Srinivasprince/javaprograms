
public class SumOfDigits {
int sum (int num){
	int sum=0;
	int digit=0;
	while(num!=0){
		digit=num%10;
	  sum=sum+(digit*digit);
	  num=num/10;
	  
			  
	}
	return sum;
}
}
