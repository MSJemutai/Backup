import java.io.*;

public class DNAList {

	public static void main(String[] args) throws IOException {

		String[] directives = new String[25]; 
		String line = null; 
		int i = 0;

		try {
			//name of file address
			FileReader fileReader = new FileReader("C:\\Users\\Arun Ramesh\\eclipse-workspace\\Lab4\\src\\command");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while((line = bufferedReader.readLine()) != null)
			{
				directives[i] = line;
				i++;
			}   
			bufferedReader.close();  
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			System.exit(0);
		}

		SequenceArray list = new SequenceArray(directives.length/2); 
		int j = 1;
		String[] a;


		for(j=1; j < directives.length; j++)
		{	
			a = null;
			try {
				a = new String[directives[j].split(" ").length];
				a = directives[j].split(" "); 
			} catch(NullPointerException e) {
				System.out.println("error");
			}


			if(a[0].equals("insert") && a.length == 3) 
				list.insert(Integer.parseInt(a[1]), " ", a[2]);
			else if(a[0].equals("insert"))
				list.insert(Integer.parseInt(a[1]), a[3], a[2]);
			else if(a[0].equals("printAll"))
				list.printAll();
			else if(a[0].equals("print"))
				list.print(Integer.parseInt(a[1]));
			else if(a[0].equals("copy"))
				list.copy(Integer.parseInt(a[1]), Integer.parseInt(a[2]));
			else if(a[0].equals("transcribe"))
				list.transcribe(Integer.parseInt(a[1]));
			else if(a[0].equals("remove"))
				list.remove(Integer.parseInt(a[1]));
			else if(a[0].equals("clip"))
				list.clip(Integer.parseInt(a[1]), Integer.parseInt(a[2]), Integer.parseInt(a[3]));

		} 	
	}
}