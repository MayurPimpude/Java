public class StringFormatter
{  
public static boolean reverseString(String str)
	{  
  	  StringBuilder sb=new StringBuilder(str);  
   	  sb.reverse();  
   	  String rev = sb.toString();  
	  if(str.equals(rev))
	  {  
	  System.out.println("String is Palidrome !!");
          return true;  
           }
	  else
	  {  
	  System.out.println("String is not Palidrome !!");
          return false;  
      	   }  
	 }
}  