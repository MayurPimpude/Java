//create Exception for program
import java.lang.*;

class MyException extends Throwable
{  
    public MyException (String str)  
    {  
        super(str);  
    }  
} 

class Exception1
{
static void compute(int a) throws MyException
{
System.out.print("a= ("+a+")");
if(a>10)
throw new MyException("a is greater than 10");
System.out.println("Normal exit");
}

public static void main(String arg[])
{

try
{
compute(1);
compute(20);
}

catch(MyException e)
{
System.out.println(" caught "+e);
}

}
}