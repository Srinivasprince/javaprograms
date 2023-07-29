
public class pattern15 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1||j==1||i==3) {
					System.out.print("f");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}



}
