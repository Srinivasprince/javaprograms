
public class Pattern20 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j==1||j==5||(j==3&i==3)||(j==4&i==4)||(j==2&i==2)) {
					System.out.print(" N");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}


}
