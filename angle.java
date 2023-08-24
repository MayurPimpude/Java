import java.util.*;
import java.lang.Math;
class angle
{

public static void cos(int g)
{
double y;
y = g*(3.14/180);
double x2=1,cosx,deno;
cosx=x2;
for(int i=1;i<=2;i++)
	{
	deno = 2*i*(2*i-1);
	x2= ((-x2*y*y)/deno);
	cosx = -cosx+x2;
	System.out.println("cos"+g+" = "+cosx);
	}

}

public static void sin(int v)
{
double accuracy = 0.0001, denominator, sinx, sinval,h;
h = v *(3.142 / 180.0);
 
    double x1 = h;
    sinx = h;        
    int i ;
    for(i=1;i<=2;i++)
    {
        denominator = 2 * i * (2 * i + 1);
        x1 = -x1 * h * h / denominator;
        sinx = sinx + x1;
	System.out.println("sin "+v+" = "+sinx);
     } 
      // System.out.println("sin"+v+"= "+sinx);
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("");
System.out.println("1. Cos");
System.out.println("2. Sin");
System.out.println("3. Exit");
System.out.println("");
System.out.print("Enter choice:");
int s = sc.nextInt();
switch(s)
{
case 1:
System.out.print("Enter angle in degree:");
int g = sc.nextInt();
cos(g);
break;

case 2:
System.out.print("Enter angle in degree:");
int v = sc.nextInt();
sin(v);
break;

case 3:
break;

default:
System.out.println("enter choice between 1 to 3 only!");

}

}

}