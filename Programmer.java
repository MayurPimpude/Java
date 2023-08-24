
class Employee
{

public void display1()
	{
	System.out.println("\ndisplay1 Employee");
	}

public void display()
	{
	System.out.println("Employee");
	}


float salary=4000;

/*Employee()
{
System.out.println("\nconstructor of Employee");
} */

}


class Programmer extends Employee
{
int bonus =1000;

 void display2()
	{
	   System.out.println("\ndisplay2 Programmer");
	}

/*Programmer()
	{
	   System.out.println("\nconstructor of Programmer");
	}
*/
 void display()
	{
	  System.out.println("\nProgrammer");
	  super.display();
	}

public static void main(String args[])
{
Programmer p = new Programmer();
System.out.println("Programmer salary is: "+p.salary);
System.out.println("Bonus of  Programmer is : "+p.bonus);
p.display();
p.display1();
p.display2();
}
}
