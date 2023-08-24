class car
{
final void run()
{
System.out.print("\ncar Speeding\n");
}
}

class Kia extends car
{
void run()
{
System.out.print("\ncar accerating\n");
}

public static void main(String args[])
{
Kia a = new Kia();
a.run();
}
}
