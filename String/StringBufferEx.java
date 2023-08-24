import java.util.*;

class StringBufferEx
{
public static void main(String args[])
{

StringBuffer str1 = new StringBuffer("Apple");
StringBuffer str2 = new StringBuffer("Fruit");

System.out.print("\nString 1 is Apple");
System.out.print("\nString 2 is Fruit\n");

str2.capacity();
System.out.print("\n String 2 Capacity : "+str2);
System.out.print("\n\n Append 	: "+str1.append(str2));
System.out.print("\n\n Reverse String2 : "+str2.reverse());
System.out.print("\n\n String 1 length : "+str1.length());
System.out.print("\n\n Delete from String1 : "+str1.delete(1,2));

}

}