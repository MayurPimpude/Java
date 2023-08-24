class prime
	{ 
	public static void main(String arg[])
		{
		int i=2;
		 float b,a=15;
		 b=a/2;
		 if(b==0 || b==1)
                  {
			System.out.println(a+" is not prime number");
		  }
		  else
		  {
			 for(i=2;i<=b;i++)
			{
			if(a%i==0)
			  { 
			   System.out.println(a+" is not prime number");
                           break;
 			  }
		         }}
		   if(a%i!=0 && b!=0 && b!=1)
		 	{
			System.out.println(a+" is a prime number");
			}
	          }	
	}