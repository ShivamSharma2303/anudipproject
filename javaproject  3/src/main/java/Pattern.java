import java.util.Scanner;

public class Pattern { // we draw l pattern using star 

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
	     System.out.println("enter the value of n");
	     int n=scan.nextInt(); // n is used to define the size of pattern
	     for(int i=0;i<n;i++)
	     {
	       for(int j=0;j<n;j++)
	       {
	         if(i>=0&&i<n-1&&j==0||i==n-1&&j>0)
	         {
	           System.out.print("*");
	         }
	         else
	         {
	           System.out.print(" ");
	         }
	       }
	       System.out.println();
	     }
	   }



	}


