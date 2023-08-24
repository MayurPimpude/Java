import java.lang.*;
import java.util.*;
class MarksOutOfBoundsException extends Throwable
{  
    public MarksOutOfBoundsException (String str)  
    {  
        super(str);  
    }  
}  


class DataException1 
{

static void details() throws MarksOutOfBoundsException
{
Scanner sc = new Scanner(System.in);
int pmarks,cmarks,mmarks,roll,seat;

System.out.print("\nEnter Name of Student : ");
String name = sc.nextLine();

System.out.print("\nEnter Date : ");
String date = sc.nextLine();

System.out.print("\nEnter Roll no. : ");
roll = sc.nextInt();

System.out.print("\nEnter Seat no. : ");
seat = sc.nextInt();

System.out.print("\nMarks Of Semester 1 \n");

System.out.print("\nEnter Physics marks : ");
pmarks = sc.nextInt();

System.out.print("\nEnter Chemistry marks : ");
cmarks = sc.nextInt();

System.out.print("\nEnter Maths marks : ");
mmarks = sc.nextInt();

if(pmarks<0 || pmarks>100 || mmarks<0 || mmarks>100 || cmarks>100 || cmarks<0)
{
throw new MarksOutOfBoundsException("\nINAVALID MARKS \n");
}
else
{
System.out.print("\nName : "+name);
System.out.print("\nRoll no. : "+roll);
System.out.print("\nSeat no. : "+seat);
System.out.print("\nEnter Physics marks : "+pmarks);
System.out.print("\nEnter Chemistry marks : "+cmarks);
System.out.print("\nEnter Maths marks : "+mmarks);
System.out.print("\n\nData Saved Successfully !! \n");
}

}

public static void main(String args[])
{

try
{
details();
}
catch(MarksOutOfBoundsException e)
{
System.out.print("\nError Caught : "+e);
}

}


}