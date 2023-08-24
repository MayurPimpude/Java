import java.util.*;
class reverse
{ public static void rever(long number)
{
 long rev=0;
 while(number!=0)
		{
	  long rem=number%10;
	   rev = rev*10+rem;
	  number=number/10;
		}
	  System.out.println("");
	  System.out.println("reverse of number ="+rev);
}

  public static void main(String arg[])
	{ 
	  System.out.println("");
	  Scanner in = new Scanner(System.in);
          System.out.print("Enter number = ");
	  long number = in.nextLong();
	  in.close();
	  rever(number);
	 
	}
}