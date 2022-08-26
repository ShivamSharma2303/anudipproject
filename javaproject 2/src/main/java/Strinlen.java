public class Strinlen { //   arrange the string in ascending order ( length wise )

static void sort(String[]s, int n) // n is used to indicate the higher length of a string
		{
			for(int i=1; i<n; i++) {
				
				String temp = s[i];  // temp is used to compare the string
				
				int j=i-1;
				while(j>=0 && temp.length()<s[j].length())
				{
					s[j+1]=s[j];
					j--;
				}
				s[j+1]=temp;
			}
		}
		
		static void printArrayString(String str[], int n)
		{
			for(int i=0; i<n; i++)
				System.out.print(str[i]+" ");
		
				}
				
		public static void main(String args[])
		{
			String[]arr = {"This", "is", "a", "easiest", "example"}; // given string
			int n = arr.length;
			
			sort(arr,n);  // sort method is used to sort the string
			
			printArrayString(arr,n); // print the sorted string 
			
			}
			

}
