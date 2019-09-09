import java.util.Scanner;

public class Lab2 {
	//QN1 A static printArrayNonGen() method with an array of Objects as parameter
	public static void printArrayNonGen(Object[] obj) {
		System.out.print("{");
		for (int i = 0; i < obj.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(obj[i]);
		}
		System.out.print("}");
		System.out.println();
	}
	//QN 2 A static printArray() method using method overloading.
	//Implement four versions of printArray(), one for each array type
	public static void printArray(Integer[] intArray) {
		System.out.print("{");
		for (int i = 0; i < intArray.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(intArray[i]);
		}
		System.out.print("}");
		System.out.println();
	}

	public static void printArray(Double[] dbles) {
		System.out.print("{");
		for (int i = 0; i < dbles.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(dbles[i]);
		}
		System.out.print("}");
		System.out.println();
	}
	public static void printArray(Character[] chrs) {
		System.out.print("{");
		for (int i = 0; i < chrs.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(chrs[i]);
		}
		System.out.print("}");
		System.out.println();
	}
	public static void printArray(String [] str) {
		System.out.print("{");
		for (int i = 0; i < str.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(str[i]);
		}
		System.out.print("}");
		System.out.println();
	}
	//QN 3 Implement a single static method printArrayGen()
	//that uses the generic programming technique to support all 4 array types and maintain type safety.
	public static <T> void printArrayGen(T [] type) {
		System.out.print("{");
		for (int i = 0; i < type.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(type[i]);
		}
		System.out.print("}");
		System.out.println();
	}
	//QN 4 Using non-generic techniques, implement a static method getMax() that takes an array of type Comparable
	//and returns the maximum element in the array.
	//(i.e. "public static Comparable getMax(Comparable [] anArray)").
	public static Comparable getMax(Comparable [] anArray) {
		Comparable max = anArray[0];
		for(int i=0;i<anArray.length;i++) {

			if(anArray[i].compareTo(max)>0)
				max= anArray[i];   
		}
		return max;
	}
	//QN 5 Using the generic techniques to specify super-class relationships,
	//implement a type safe version of the method in 4 named getMaxGen().
	public static <T extends Comparable<T>> T getMaxGen(T[] myarray){


		T max = myarray[0];
		for(T items:myarray) {
			if((items).compareTo(max) > 0)
				max = items;
		}

		return max;

	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arrA  = scanner.nextLine().split("\\s"); //input integers with white spaces between them (e.g. 1 2 3 4)
		String[] arrB = scanner.nextLine().split("\\s"); //input doubles with white spaces between them (e.g. 1.1 2.2 3.3 4.4)
		String[] arrC = scanner.nextLine().split("\\s"); //input characters with white spaces between them (e.g. H E L L O)
		String[] strArray = scanner.nextLine().split("\\s"); //input strings with white spaces between them (e.g. once upon a time)

		Integer[] intArray = new Integer[arrA.length];
		Double[] doubArray = new Double[arrB.length];
		Character[] charArray = new Character[arrC.length];

		for(int i=0;i<arrA.length;i++){intArray[i] = Integer.parseInt(arrA[i]);}
		for(int i=0;i<arrB.length;i++){doubArray[i] = Double.parseDouble(arrB[i]);}
		for(int i=0;i<arrC.length;i++){charArray[i]=arrC[i].charAt(0);}

		printArrayNonGen(intArray);
		printArrayNonGen(doubArray);
		printArrayNonGen(charArray);
		printArrayNonGen(strArray);

		printArray(intArray);
		printArray(doubArray);
		printArray(charArray);
		printArray(strArray);

		printArrayGen(intArray);
		printArrayGen(doubArray);
		printArrayGen(charArray);
		printArrayGen(strArray);

		System.out.println(getMax(intArray));
		System.out.println(getMax(doubArray));
		System.out.println(getMax(charArray));
		System.out.println(getMax(strArray));

		System.out.println(getMaxGen(intArray));
		System.out.println(getMaxGen(doubArray));
		System.out.println(getMaxGen(charArray));
		System.out.println(getMaxGen(strArray));




	}

}