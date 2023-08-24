import java.applet.*;
import java.awt.*;

public class Basic2 extends Applet
{

public void paint(Graphics g)
{
g.setColor(Color.blue);
g.drawLine(0,100,100,0);
g.drawLine(0,0,100,100);
}

}

/*
<applet code="Basic2.class" width="300" height="300">
</applet>
*/