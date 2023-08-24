import java.util.*;

class Data
{
  protected String Name="Mayur Pimpude"
  private String password="Lily1414";
  private int id=1545;

  public int GetId()
	{
	   return this.id;
	}

  public String GetPassword()
	{
	   return this.password;
	}

}

class NewBank
{
  public int a=10000,b;

public static void main(String args[])
{
	int id;
	NewBank b1 = new NewBank();
	Data d1 = new Data();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("");
	System.out.println("-------------------------------------------");
	System.out.println("\t\tNATIONAL GRANT BANK");
	System.out.println("-------------------------------------------");
	System.out.println("");
	System.out.println("============================================");
	System.out.println("\t\tATM");
	System.out.println("============================================");

		System.out.print("Enter Account Number : ");
		int acc = sc.nextInt();
		id=d1.GetId();
	if(id==acc)
	{
	 	System.out.print("\nEnter PIN : ");
		sc.nextLine();
		String pass = sc.nextLine();
		String password = d1.GetPassword();

if(pass.equals(password))
{
	while(true)
	{
	System.out.println("\n\t**WELCOME**");
	System.out.println("");
	System.out.println("1.Withdraw");
	System.out.println("2.Balance");
	System.out.println("3.Logout");
	System.out.print("\nEnter choice : ");
	int choice = sc.nextInt();
		switch(choice)
		{
		  case 1:
		  System.out.println("\t**WITHDRAW**");
		  b1.withdraw();
		  break;

		  case 2:
		  b1.details();
		  break;

		  case 3:
		  System.out.println("THANK YOU FOR USING GBL SERVIES !");
		  System.exit(0);

		  default:
		  System.out.println("Invalid choice");

		}
	}
}

	else
	{
		System.out.println("\tInvalid PIN !!");
	}

}

        else
	{
	 System.out.println("\nINVALID ACCOUNT NUMBER !!");
	}

}


void withdraw()
	{
	  Date date = new Date();
	  Scanner sc = new Scanner(System.in);
	  System.out.print("\nEnter Amount : ");
	  int s = sc.nextInt();
	  if(a>s)
	  {
		a = a -s;
		System.out.println("");
		System.out.println(" Withdraw Successfull ");
		System.out.println("");
		System.out.println(" Thank you !");
		System.out.println("");
		System.out.println("-------------------------------------");
		System.out.println("\t\tRecipt");
		System.out.println("-------------------------------------");
		System.out.println("Amount withdrawn : "+s);
		System.out.println("");
		System.out.println("\nCurrent Balance : "+a);
		System.out.println("");
		String str = String.format("date/time : %tc",date);
		System.out.println(str);
	}
	else
	{
		System.out.println("Invaild Balance");
	}
}

void details()
	{
		Data d = new Data();
		System.out.println("-------------------------------------");
		System.out.println("\t\tDETAILS");
		System.out.println("-------------------------------------");
		System.out.print("\nAccount holder name : "+Name);
		System.out.print("\nAccount number : "+d.GetId());
		System.out.print("\nAccount Balance is : "+a);
		System.out.println("");
	}


}