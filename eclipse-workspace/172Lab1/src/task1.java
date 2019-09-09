import java.util.Arrays;
import java.util.Scanner;

public class task1 {

	public static boolean isAnagram(String str1, String str2) {
		//put characters of the string in an array
		char [] a= str1.toCharArray();
		char [] b = str2.toCharArray();

		//first check if they have same length
		int x =  a.length;
		int y = b.length;
		if(x!=y) {
			return false;

		}
		//if same length sort then compare
		else {
			Arrays.sort(a); 
			Arrays.sort(b);
			for(int i=0; i<x;i++) {
				if(a[i] != b[i]) 
					return false;	

			} // if all the above conditions worked return true
			return true;}
	}
	public static void main(String[] args) {

		System.out.println("Enter two strings you wish to check if are anagrams");
		Scanner in = new Scanner(System.in);
		String one = in.next();
		String two = in.next();


		if( isAnagram(one,two)) {;
		System.out.println("The two are anagrams");
		}
		else {
			System.out.println(" the two are not anagrams");
		}

	}

}
