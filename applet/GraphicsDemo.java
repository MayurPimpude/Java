import java.applet.Applet;  
import java.awt.*;  
  
public class GraphicsDemo extends Applet
{  
  
public void paint(Graphics g)
{  
Font plainFont = new Font("Serif", Font.PLAIN, 24);          
g.setFont(plainFont); 
 
setBackground(Color.black);

g.setColor(Color.magenta);  
g.drawString("HOUSE FROM APPLET",25,30);

g.setColor(Color.yellow);     
g.fillRect(100,100,150,200);
 
g.setColor(Color.red); 
g.fillRect(140,210,70,90); 

g.setColor(Color.green);   
g.fillOval(150,250,10,10);

g.setColor(Color.cyan);   
g.fillOval(158,140,45,45);

g.setColor(Color.pink);   
g.fillArc(100,65,150,80,0,180);

}  
}  

/*<applet code="GraphicsDemo.class" width="300" height="300">  
</applet>*/  