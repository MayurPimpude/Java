import java.util.Scanner;
 class Matrix
{   
    public static void main(String[] args)
    {	
	Scanner sc = new Scanner(System.in);
	System.out.println("");
	System.out.println("Matrix 1");
        System.out.print("Enter the no. of rows1 : ");
        int rows1 = sc.nextInt();
	System.out.println("");
 
        System.out.print("Enter the no. of columns1 : ");
        int cols1 = sc.nextInt(); 
	System.out.println("");
 
        int matrix1[][] = new int[rows1][cols1];
        System.out.println("Enter the elements :"); 
        for (int i = 0; i < rows1; i++)
        {
            for (int j = 0; j < cols1; j++)
            {
                matrix1[i][j] = sc.nextInt();
            }
        }
        
	System.out.println(""); 
	 System.out.println("Matrix 2");
	 System.out.print("Enter the no. of rows2 : ");
        int rows2 = sc.nextInt();
	System.out.println("");
 
        System.out.print("Enter the no. of columns2 : ");
        int cols2 = sc.nextInt(); 
	System.out.println("");
 
        int matrix2[][] = new int[rows2][cols2];
        System.out.println("Enter the elements :"); 
        for (int k = 0; k < rows2; k++)
        {
            for (int g = 0; g < cols2; g++)
            {
                matrix2[k][g] = sc.nextInt();
            }
        }

        System.out.println("Printing the input matrix1 :");
         
        for (int i = 0; i < rows1; i++)
        {
            for (int j = 0; j < cols1; j++)
            {
                System.out.print(matrix1[i][j]+"\t");
            }
             
            System.out.println();
        }


	 System.out.println("Printing the input matrix2 :");
         
        for (int k = 0; k < rows2; k++)
        {
            for (int g = 0; g < cols2; g++)
            {
                System.out.print(matrix2[k][g]+"\t");
            }
             
            System.out.println();
        }
	
	 if (rows2 != cols1)
	 {
 
            System.out.println("\nMultiplication Not Possible");
            return;
         }
	else
	{
	
	 int C[][] = new int[rows1][cols2];
	for (int i = 0; i < rows1; i++)
	 {
            for (int j = 0; j < cols2; j++) 
		{
                for (int k = 0; k < cols2; k++)
			{
                 	   C[i][j] += matrix1[i][k] * matrix2[k][j];
               		 }
       		 }
            
  	  }
	
	System.out.println("\nResultant Matrix:");
	for (int i = 0; i < rows1; i++)
	{
		for(int j = 0; j < cols2; j++)
		{
		System.out.print(C[i][j] + " ");
		}
		System.out.println();
	}

	}
	}
}