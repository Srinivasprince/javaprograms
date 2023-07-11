import java.util.Scanner;

public class Function {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	String s1=scan.next();
	String s2=scan.next();
	System.out.println(joinStrings(s1,s2));
}
	
	
public static String joinStrings(String str1, String str2) {
	return str1+str2;
	
}
}
