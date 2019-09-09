
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Lab3Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input integers with white space between them
        ArrayList<Integer> list = new ArrayList<Integer>();
        String[] tempB = scanner.nextLine().split("\\s");
        for(String s : tempB) {
            list.add(Integer.parseInt(s));
        }

        printArrayListBasicLoop(list);
        printArrayListEnhancedLoop(list);
        printArrayListForLoopListIterator(list);
        printArrayListWhileLoopListIterator(list);
    
       

        scanner.close();



    }
//print in an arrayList
    //Using basic while / for loop - printArrayListBasicLoop(ArrayList al); 
    private static void printArrayListBasicLoop(ArrayList<Integer>  al) {
        for (int i = 0; i < al.size(); i++){
            System.out.println(al.get(i));
        }
        
    }
//Using enhanced for loop (:)
    private static void printArrayListEnhancedLoop(ArrayList<Integer> list) {
        for(int i:list) {
            System.out.println(i);
        }
        
    }
    //Using basic for loop with iterator
    private static void printArrayListForLoopListIterator(ArrayList<Integer> list) {
         for (Iterator<Integer> i = list.iterator(); i.hasNext(); ){
             Integer integer = i.next();
                System.out.println(integer);
            }
        
    }
    //Using basic while loop with iterator
    private static void printArrayListWhileLoopListIterator(ArrayList<Integer> list) {
        Iterator<Integer>  i = list.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
             
        }
        
    }
}