import java.util.Scanner;

public class CharacterApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		Character c1=new Character();
		System.out.println("enter char");
		char c=scan.next().charAt(0);
		System.out.println(c1.decodeCharacter(c));
		
	}

}
