import java.util.*;
  
public class VectorTest
 {
    public static void main(String args[])
    {
        
        Vector<String> vector = new Vector<String>();
  	String s = new String();
        Scanner sc = new Scanner(System.in);
	
        vector.add("Apple");
        vector.add("Mango");
        vector.add("Grapes");
        vector.add("Pineapple");
        vector.add("Guava");
          
        System.out.println("\nVector are : " + vector);
	
        System.out.print("\nWhich Vector To find : ");
        s = sc.nextLine();

        System.out.println("Does the element in vector Exist : " + vector.contains(s));
  
        
     }
}
