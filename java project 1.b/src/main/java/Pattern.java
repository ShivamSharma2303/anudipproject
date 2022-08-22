
public class Pattern {  // to draw a pattern

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {    // i indicate row
		      
		      for(int j=1;j<=i;j++) {     //j indicate column
		        System.out.print(j);       
		      }
		      for(int j=i-1;j>=1;j--) {     // 
		        System.out.print(j);
		      }
		      System.out.println();
		    }
	}

}
