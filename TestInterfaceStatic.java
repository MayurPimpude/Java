interface Drawable
{  
void draw();  
}

interface Sketch
{
void sketching();
} 
 
class Rectangle implements Drawable,Sketch
{  
public void draw()
{
System.out.println("\ndrawing rectangle");
}  

public void sketching()
{
System.out.print("\n sketched !");
}
}  
  
public class TestInterfaceStatic
{  
public static void main(String args[])
{  
Rectangle d=new Rectangle();  
d.draw(); 
d.sketching();  
}
}  