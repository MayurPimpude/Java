import java.util.*;
import java.lang.*;
class figure
{

void area(float l,float b)
{
float a=l*b;
System.out.print("\n area : "+a);
}

void area(double r)
{
double a1=3.14*r*r;
System.out.println("\n Area : "+a1);
}

void area(int s)
{
int a2 = s*s;
System.out.println("\n Area : "+a2);
}

void area(double f,double h)
{
double a3 = 0.5*f*h;
System.out.println("\n Area : "+a3);
}
}

public class area
{
public static void main(String arg[])
{
figure obj = new figure();
Scanner sc = new Scanner(System.in);
System.out.println("\nArea of Rectangle");
System.out.print("\n Enter length : ");
float l = sc.nextFloat();
System.out.print("\n Enter breadth : ");
float b = sc.nextFloat();
obj.area(l,b);

System.out.println("\nArea of Circle");
System.out.print("\n Enter radius : ");
double r = sc.nextDouble();
obj.area(r);

System.out.println("\nArea of Square");
System.out.print("\n Enter side : ");
int s = sc.nextInt();
obj.area(s);

System.out.println("\nArea of Triangle");
System.out.print("\n Enter breadth : ");
double f = sc.nextDouble();
System.out.print("\n Enter height : ");
double h = sc.nextDouble();
obj.area(f,h);
}
}