import java.util.*;
import java.lang.*;
class Student
{ 
int roll;
String name;
float total,maths,chem,phy;

void info()
{
Scanner sc = new Scanner(System.in);
System.out.println("");
System.out.print("Enter Name : ");
 name = sc.nextLine();
System.out.print("\nEnter roll no. : ");
 roll = sc.nextInt();
System.out.print("\nEnter Maths marks : ");
 maths = sc.nextFloat();
System.out.print("\nEnter physic's marks : ");
 phy = sc.nextFloat();
System.out.print("\nEnter chemistry marks : ");
 chem = sc.nextFloat();
total = maths+phy+chem;
}

void display() 
{
System.out.println("\nDETAILS ");
System.out.print("\nNAME : "+name);
System.out.print("\nROLL NO. "+roll);
System.out.print("\nMaths marks : "+maths);
System.out.print("\nPhysic's marks : "+phy);
System.out.print("\nchemistry marks : "+chem);
}


public static void main(String args[])
{
Student s1 = new Student();

s1.info();
s1.display();

}
}





