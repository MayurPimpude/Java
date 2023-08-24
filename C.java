package calculator;
import java.util.Scanner;
public class C
{
public int a,b,c;
Scanner sc = new Scanner(System.in);

public void addition()
{
System.out.println("ADDITION");
System.out.print("\nEnter number1 : ");
 b = sc.nextInt();
System.out.print("\nEnter number2 : ");
 c = sc.nextInt();
a = b + c;
System.out.print("\nAddition of "+b+" and "+c+" is : "+a);
System.out.println("\n");
}

public void subtraction()
{
System.out.println("SUBTRACTION");
System.out.print("\nEnter number1 : ");
 b = sc.nextInt();
System.out.print("\nEnter number2 : ");
 c = sc.nextInt();
a = b - c;
System.out.print("\nSubtraction of "+b+" and "+c+" is : "+a);
System.out.println("\n");
}

public void multiplication()
{
System.out.println("MULTIPICATION");
System.out.print("\nEnter number1 : ");
 b = sc.nextInt();
System.out.print("\nEnter number2 : ");
 c = sc.nextInt();
a = b*c;
System.out.print("\nMultiplication of "+b+" and "+c+" is : "+a);
System.out.println("\n");
}

protected void division()
{
System.out.println("DIVISION");
System.out.print("\nEnter number1 : ");
 b = sc.nextInt();
System.out.print("\nEnter number2 : ");
 c = sc.nextInt();
a = b/c;
System.out.print("\nDivision of "+b+" and "+c+" is : "+a);
System.out.println("\n");
}
} 