
abstract class Shape
{
abstract void area();
}
 
class Rectangle extends Shape
{
void area()
{
System.out.print("\nArea of Rectangle ");
}
}

class Circle extends Shape
{
void area()
{
System.out.print("\nArea of Circle ");
}
}

class Triangle extends Shape
{
void area()
{
System.out.print("\nArea of Triangle ");
}
}

class Abs
{
public static void main(String args[])
{
Shape r = new Rectangle();
Shape c = new Circle();
Shape t = new Triangle();
r.area();
c.area();
t.area();
}
}