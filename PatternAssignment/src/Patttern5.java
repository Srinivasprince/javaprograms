
public class Patttern5 {
	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(i==1||i==3||i==6||(j==1&i==2)||(j==6&i==5)||(j==6&i==4)) {
					System.out.print("S");
				}
				else {
                     System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
