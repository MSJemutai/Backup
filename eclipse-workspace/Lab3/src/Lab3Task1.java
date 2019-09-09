import java.util.Scanner;
import java.util.ArrayList;

public class Lab3Task1 {
//print2Darray(int[][] array) ​to print a formatted 4x4 two dimensional      
	//integer array
	public static void print2Darray(int[][] array) {
		for (int row = 0; row < array.length; row++) {  
			// Loop through all elements of current row 
			for (int column = 0; column < array[row].length; column++) {
				System.out.print(array[row][column] + " ");

			}
			System.out.println();
		}
	}
	// implement another function ​
	//print2DList(ArrayList<ArrayList<Integer>>list) ​to print a formatted 2D list.
	public static void print2DList(ArrayList<ArrayList<Integer>> list) {
		for (int row = 0; row < list.size(); row++) { 
				for (int column = 0; column < list.get(row).size(); column++) {
					System.out.print(list.get(row).get(column)+ "\t");
					
				}
				System.out.println();
			}
		}

	

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		//input arrays with ";" between them
		String[] temp = scanner.nextLine().split(";");

		//input integers with white space between them
		int[][] arr = new int[4][4];
		for(int i = 0; i < 4; i++){
			String[] tempA = temp[i].split("\\s");
			for(int j = 0; j < 4; j++){
				arr[i][j] = Integer.parseInt(tempA[j]);
			}
		}

		//input integers with white space between them
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
			for(int i = 0; i < 4; i++){
				String[] tempA = temp[i].split("\\s");
				list.add(i, new ArrayList<Integer>());
				for(int j = 0; j < 4; j++){
					list.get(i).add(j, Integer.parseInt(tempA[j]));
				}
			}
		 
		print2Darray(arr);
		print2DList(list);

		scanner.close();

	}



}

