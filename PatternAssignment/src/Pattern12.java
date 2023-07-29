
public class Pattern12 {
	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(j==6||j==1||(j==3&i==4)||(j==2&i==5)||(j==4&i==5)) {
					System.out.print(" W");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	}



