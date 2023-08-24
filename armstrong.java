import java.util.*;
class armstrong
{

public static void arm(int f,int g)
{
 	int n, count = 0, a, b, c, sum = 0;
	System.out.println("");
	System.out.print("Armstrong between range " +f+ " to " +g+ " are: ");
        for(; f <= g; f++)
        {
            n = f;
            while(n > 0)
            {   
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
		
            }
	   
            if(sum == f)
            {   
                System.out.print(f+" ");
		
            }
		     	    
            sum = 0;
        }
	
	System.out.println("");
}

    public static void main(String[] args) 
     {
       
	System.out.println("");
	Scanner sc = new Scanner(System.in);
        System.out.print("Armstrong numbers from lower limit:");
	int f = sc.nextInt();
	System.out.println("");
	System.out.print("Armstrong numbers from upper limit:");
	int g = sc.nextInt();
	arm(f,g);
    }
}