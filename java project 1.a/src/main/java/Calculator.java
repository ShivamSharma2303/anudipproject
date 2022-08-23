import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		int n1, n2, res;  // n1 is number 1 which is given by user,same n2 is number 2,res is used to store the result
		
		
	    Scanner input = new Scanner(System.in); // used to take input 
 


	    System.out.println("Enter first number");
	    n1 = input.nextInt();
	    System.out.println("Enter 1 for : +, Enter 2 for : -, enter 3 for : *, Enter 4 for : /");  // user choose operators accordingly
	    int choice = input.nextInt();
	    System.out.println("Enter second number");
	    n2 = input.nextInt();
	    
	   

	    switch (choice) {

	     
	      case 1:     // if user wants to add numbers
	        res = n1 + n2;
	        System.out.println(n1 + " + " + n2 + " = " + res);
	        break;   // break is used to jump into the next/ change logic 

	 
	      case 2:     //if   user wants to subtract numbers
	        res = n1 - n2;
	        System.out.println(n1 + " - " + n2 + " = " + res);
	        break;

	     
	      case 3:     //if user wants to multiply numbers
	        res = n1 * n2;
	        System.out.println(n1 + " * " + n2 + " = " + res);
	        break;

	     
	      case 4:   // if user wants to divide numbers
	        res = n1 / n2;
	        System.out.println(n1 + " / " + n2 + " = " + res);
	        break;

	      default:    // there is no valid choice to calculate some numbers
	        System.out.println("Invalid operator");
	        break;
	    }

	}

}
