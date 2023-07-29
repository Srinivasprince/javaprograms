
public class Pattern2 {
	public static void main(String[] args) {
		
	    
	    for (int i = 1; i <= 5; i++) {
	      
	      for (int j = 5; j > i; j--) {
	        System.out.print(" ");
	      }
	      
	      for (int k = 0; k < i * 2 - 1; k++) {
	        if (k == 0 || k == 2 * i - 2) {
	          System.out.print("*");
	        }
	        else {
	          System.out.print(" ");
	        }
	      }
	      System.out.println();
	    }
	
	    for (int i = 1; i < 5; i++) {
	      
	      for (int j = 0; j < i; j++) {
	        System.out.print(" ");
	      }
	     
	      for (int k = (5- i) * 2 - 1; k >= 1; k--) {
	        if (k == 1 || k == (5- i) * 2 - 1) {
	          System.out.print("*");
	        }
	        else {
	          System.out.print(" ");
	        }
	      }
	      System.out.println();
	    	}
	    }
	}

	    