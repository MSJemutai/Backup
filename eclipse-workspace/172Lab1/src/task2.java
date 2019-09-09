import java.util.Scanner;

public class task2 {


	public static boolean isRotation(String one, String two) {

		String concat= one + one;

		//check length first rule of thumb
		int x = one.length();
		int y = two.length();
		if(x!=y) {
			return false;
		}
		//if same length now check if substring (two) exists in concatenated string
		if (concat.indexOf(two) != -1) { return true; }

		return false;

	}
	public static void main(String[] args) {


		System.out.println("Enter two strings to check if rotations of each other");
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();

		if(isRotation(a,b)) {
			System.out.println("They are a rotation of each other");
		}
		else {
			System.out.println("They are NOT a rotation of each other");
		}

	}

}
