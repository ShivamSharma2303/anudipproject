package anudippro;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		
		 HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
		  
	      for(int i=1; i<=15; i++) {
	    	  
	      }
	     
	        hash_map.put("Geeks", 10);
	        hash_map.put("4", 15);
	        hash_map.put("Geeks", 20);
	        hash_map.put("Welcomes", 25);
	        hash_map.put("You", 30);
	  
	        // Displaying the HashMap
	        System.out.println("Initial Mappings are: " + hash_map);
	  
	        System.out.println("The collection is: " + hash_map.values());
	    }

	}


