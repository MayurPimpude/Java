//inheritance
class Employee
{

public void display1()
	{
	System.out.println("\ndisplay1 Employee");
	}

 void display()
	{
	System.out.println("Employee");
	}

}


class Programmer extends Employee
{
int bonus =1000;

 void display2()
	{
	   System.out.println("\ndisplay2 Programmer");
	}

 void display()
	{
	  System.out.println("\nProgrammer");
	  super.display();
	}
}

class Engineer extends Programmer
{
public static void main(String args[])
{
Engineer p = new Engineer();
p.display();
 super.display();
}
}
