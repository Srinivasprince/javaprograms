
public class Pattern13 {
	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(j==1||(j==4&i==2)||(j==3&i==3)||(j==2&i==4)||(j==3&i==5)||(j==4&i==6)) {
					System.out.print(" K");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
