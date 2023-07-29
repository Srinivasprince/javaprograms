
public class pattern19 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j==1||j==5||(j==3&i==3)||(j==4&i==2)||(j==2&i==2)) {
					System.out.print(" M");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}


}
