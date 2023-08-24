import java.util.*;
class input
{  public static void main(String arg[])
	{	
		Scanner in=new Scanner(System.in);
		System.out.println("");

		System.out.print("enter name:");
		String name = in.nextLine();
		System.out.print("enter number:");
		long number = in.nextLong();
		System.out.print("enter cgpa:");
		float cgpa = in.nextFloat();
		in.close();

		System.out.println("");
		System.out.println(" name:"+name);
		System.out.println(" number:"+number);
		System.out.println(" cgpa:"+cgpa);
	}
}