
public class Infinite {
	public static void main(String[] args) {
		int i=1;
		for(; ;) {
			if(i != 199999) {
				System.out.println("value is:"+i);
				
			}
			if(i == 200000) {
				break;
			}
			i++;
		}
		
	}

}
