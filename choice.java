import java.util.Scanner;
class choice
{public static void main(String arg[])
{int a,b;

Scanner in=new Scanner(System.in);
System.out.println("");

System.out.println("1. BITWISE OPERATORS");
System.out.println("2. LOGICAL OPERATORS");
System.out.println("3. RELATIONAL OPERATORS");
System.out.println("4. EXIT");
System.out.println("\n");
System.out.print("Enter choice: ");
int ch = in.nextInt();
in.close();
boolean c=true;
boolean d=false;
switch(ch)
{
case 1:
System.out.println("\nBITWISE\n");
a=5;
b=7;
//System.out.println("a & b "+(a&b));
System.out.println("a | b "+(a|b));
System.out.println("a<<b "+(a<<b));
System.out.println("a>>b "+(a>>b));
System.out.println("a^b "+(a^b));
System.out.println("~a "+(~a));
break;

case 2:
System.out.println("\nLOGICAL OPERATORS\n");
System.out.println(" c||d "+(c||d));
System.out.println(" c&&d "+(c&&d));
System.out.println(" !(c&&d) "+!(c&&d));
break;

case 3:
a=2;
b=5;
System.out.println("\nRELATIONAL OPERATOR\n");
System.out.println(" a = "+a);
System.out.println(" b = "+b);
System.out.println(" a==b "+(a==b));
System.out.println(" a!=b "+(a!=b));
System.out.println(" a>b  "+(a>b));
System.out.println(" a<b  "+(a<b));
System.out.println("a>=b "+(a>=b));
System.out.println("a<=b "+(a<=b));
break;

case 4:
break;

default:
System.out.println("enter between 1 to 4");
}

}}