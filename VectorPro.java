import java.util.*;

class VectorPro
{
public static void main(String args[])
{
int choice,rem,index;
Scanner sc = new Scanner(System.in);
Vector<Integer> vec = new Vector<Integer>();

vec.add(200);
vec.add(600);
vec.add(300);
vec.add(400);

do{
System.out.println("");
System.out.println("****VECTOR****\n");
System.out.println("1.Display");
System.out.println("2.Sort");
System.out.println("3.Remove Element");
System.out.println("4.Last Element");
System.out.println("5.Index");
System.out.println("6.Exit");

System.out.print("\nEnter choice : ");
 choice = sc.nextInt();
switch(choice)
{
case 1:
System.out.println("Values in Vector are : "+vec);
break;

case 2:
System.out.println("Before Sorting : "+vec);
Collections.sort(vec);
System.out.println("After Sorting : "+vec);
break;

case 3:
System.out.print("\nEnter Index Number To Remove Element : ");
rem = sc.nextInt();
vec.remove(rem);
System.out.println("Element at Index "+rem+" Removed Successfully !!");
System.out.println("Values in Vector are : "+vec);
break;

case 4:
System.out.print("\nLast Element is : "+vec.lastElement());
break;

case 5:
System.out.print("\nEnter Index number : ");
index = sc.nextInt();
System.out.print("\nElement at "+index+" is : "+vec.get(index));
break;

case 6:
System.out.println("..END !\n");
break;

default:
System.out.println("Invalid Choice !!\n");
}

}while(choice!=6);


}
}

