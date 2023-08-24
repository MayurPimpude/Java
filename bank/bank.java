import java.util.*;
class bank
{
public int a=10000,b;

public static void main(String args[])
{
bank b1 = new bank();
String password = "gbl5125";
Scanner sc = new Scanner(System.in);
System.out.println("");
System.out.println("-------------------------------------------");
System.out.println("\t\tNATIONAL GRANT BANK");
System.out.println("-------------------------------------------");
System.out.println("");
System.out.println("============================================");
System.out.println("\t\tATM");
System.out.println("============================================");
System.out.print("Enter PIN : ");
String pass = sc.nextLine();
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
System.out.println("-------------------------------------");
System.out.println("\t\tDETAILS");
System.out.println("-------------------------------------");
System.out.print("\nAccount holder name : ");
System.out.print("\nAccount number : ");
System.out.print("\nAccount Balance is : "+a);
System.out.println("");
}


}