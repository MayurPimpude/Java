import java.awt.*;
import java.applet.Applet;

/*<applet code="AppletPara" width="300" height="300">  
<param name="Name" value="mayur">
<param name="Car" value="Volvo">
<param name="Color" value="Red">
<param name="Food" value="Chole">
<param name="Subject" value="History">
</applet>*/

public class AppletPara extends Applet
{
String name;
String car;
String color;
String food;
String subject;

public void init()
{
name=getParameter("Name");
car=getParameter("Car");
color=getParameter("Color");
food=getParameter("Food");
subject=getParameter("Subject");
}

public void paint(Graphics g)
{
g.drawString("NAME is : "+name,20,20);
g.drawString("Favourite Car : "+car,20,30);
g.drawString("Favourite Color : "+color,20,40);
g.drawString("Favourite Food : "+food,20,50);
g.drawString("Favourite Subject : "+subject,20,60);
}
}