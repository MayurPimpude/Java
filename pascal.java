import java.util.*;
class pascal
{
public static void PascalTriangle(int row) 
	{ int i,j;
		for (i = 0; i < row; i++) 
		{ int n=1;
		 System.out.printf("%" + (row - i) * 2 + "s","");
		 for (j = 0; j <= i; j++)
		 	{	 System.out.printf("%d", n); 
				n = n * (i - j) / (j + 1); 
			} 
		 System.out.println("");
		}
	}

 public static void main(String args[])
	{
		System.out.print("\nEnter number of row for pascal:");
		Scanner in = new Scanner(System.in);
		int row = in.nextInt();
		PascalTriangle(row);
	}
}
				