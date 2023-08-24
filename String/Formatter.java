//reverse string and captialize string
import java.util.*;
import java.lang.*;
public class Formatter 
{ 

public static String capitalize(String rev)
 {
    if(rev == null || rev.isEmpty()) 
	{
        return rev;
        }

	return rev.toUpperCase();
 } 

public static void main(String[] args)
   {  
    Scanner in = new Scanner(System.in);
	System.out.println("");
    System.out.print("Enter string to check: "); 
    String rev = in.nextLine(); 
	 System.out.println("");
   System.out.println(capitalize(rev+" "));
	System.out.println("");
    StringFormatter.reverseString(rev); 
	
    }  
}  