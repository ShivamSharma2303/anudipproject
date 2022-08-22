import java.util.Scanner;

 class Student {         //in a class there r many student then all student keep in a different group according to their roll no 
          public static void main (String[] args) {
        	  
        		System.out.println("Enter your Roll no.");
		Scanner scan = new Scanner(System.in);    //  used to take input from user
	    int rollno=scan.nextInt();
		
		if(rollno==1||(rollno-1)%4==0) {    
			System.out.println("Sapphire group");
		}
		else if(rollno==2||(rollno-2)%4==0) {
			System.out.println("Perl1 group");
		}
		
		else if(rollno==3||(rollno-3)%4==0) {
			System.out.println("Ruby group");
		}
		
		else if(rollno==4||(rollno-4)%4==0) {
			System.out.println("Emerald group");
		}
		
	
 
	}



	}

