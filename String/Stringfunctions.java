				//all string functions 
import java.util.*;
import java.lang.*;
class Stringfunctions
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("");
System.out.print("Enter String1 : ");
String str1 = sc.nextLine();
System.out.print("\nEnter String2 : ");
String str2 = sc.nextLine();

System.out.print("\n\n 1.String1 to uppercase : "+str1.toUpperCase());
System.out.print("\n\n 2.String2 to uppercase : "+str2.toLowerCase());
System.out.print("\n\n 3.String1 to length : "+str1.length());
System.out.print("\n\n 4.Strings Comapare : "+str1.compareTo(str2));
String str3 = str1.concat(str2);
System.out.print("\n\n 5.String1 and 2 concatination : "+str3);
System.out.print("\n\n 6.String3 substring(0,4) : "+str3.substring(0,4));
System.out.print("\n\n 7.Is String1 equal to string2 : "+str1.equals(str2));
System.out.print("\n\n 8.Is String1 equal to string2(IgnoreCase) : "+str1.equalsIgnoreCase(str2));
System.out.print("\n\n 9.Enter string by String1 starts with : ");
String str4 = sc.nextLine();
System.out.print("\n 9.String1 starts with "+str4+" : "+str1.startsWith(str4));
System.out.println("");
}

}