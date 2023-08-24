class Multicatch
{
public static void main(String arg[])
{
try{
int a = arg.length;
System.out.println("a= "+a);
int b = 42/a;
int c[] ={1};
c[42]=99;
}

catch(ArithmeticException e)
{
System.out.println("Divide by 0: "+e);
}

catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array index out: "+e);
}

System.out.println("After try block");
}
}