
public class pattern11 {
	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(i==j||(j==6&i==5)||(j==6&i==4)||(j==6&i==3)||(j==6&i==2)||(j==6&i==1)) {
					System.out.print("V");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	}


