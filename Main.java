import java.util.*;
import java.lang.*;
class Main 
{
   int s,s1;
    Main()
    {
    }
  
    Main(int r1, int r2)
    {
       	  s = r1 + r2;
	
    }
  void add(int i1,int i2)
	{
	 s1 = i1 + i2;
	}
   void display()
	{
	  System.out.print("\n Addition = "+s+" + "+s1+"i ");
	}
  

    public static void main(String args[])
    {
        int r1, r2,i1,i2;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter real 1 numbers:");
          r1 = sc.nextInt();
	System.out.print("\nEnter real  2 numbers:");
          r2 = sc.nextInt();
	System.out.print("\nEnter imaginary 1 numbers:");
	  i1 = sc.nextInt();
	System.out.print("\nEnter imaginary 2 numbers:");
	  i2 = sc.nextInt();

        Main t1 = new Main();
	Main t2 = new Main(r1,r2);
         t2.add(i1,i2);
	 t2.display(); 
	
    }
 
}