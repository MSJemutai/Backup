import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {

	public static void main(String[] args)throws FileNotFoundException{
		File file = new File("commands.txt");
		Scanner in = new Scanner(file);	

		while (in.hasNextLine()) {
			String []	array = in.nextLine().split("\\s");

			// insert()
			if (array[0].equals("insert")) {
				//insert(l, array[1]);  //???
				
			}
			//largest
			/*if(array[0].equals("largest")) {
				
			}
			//smallest
			if(array[0].equals("smallest")) {
				
			}
			//search
			if(array[0].equals("search")) {
				
			}
			//size
			if(array[0].equals("size")) {
				
			}
			//height
			if(array[0].equals("height")) {
				
			}
			//trieToList
			if(array[0].equals("trieToList")) {
				
			}*/

		}
	}

	}


