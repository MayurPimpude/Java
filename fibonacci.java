import java.util.*;
class fibonacci
{public static void fibo(int a)
{
  int n=0,m=1,z=0,counter=0;
 for(;counter<a;counter++)
 { 
   System.out.print(" "+n);
   z=n+m;
   n=m;
   m=z;
 }
System.out.println("");
}

public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.println("");
System.out.print("ENTER NUMBER OF FIBONACCI SERIES:");
int a = in.nextInt();
fibo(a);
in.close();
System.out.println("");
}
}