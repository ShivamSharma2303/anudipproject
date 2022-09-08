package anudippro;

import java.util.HashMap;

public class hash {
		public static void main(String[] args) {
		


			HashMap<Integer, Integer> square = new HashMap<Integer, Integer>();			

			for(int i=1;i<=15;i++) {
				square.put(i, i*i);
			}

			
			System.out.println("Initial Mappings are: " + square);

		
			System.out.println("The collection is: " + square.values());
		}
	}
	

