import java.awt.*; 
import java.applet.Applet;    
import java.awt.event.*;    
import java.lang.*;

public class GUIBank extends Applet implements ActionListener 
{    
    boolean flag;int i;
    TextField tf1, tf3;    
    Button b1, b2;   
   
    public void init()
    {  
	Label title = new Label("NBI BANK");
	title.setBounds(60,1, 200, 40);
	
        Label CardNumber = new Label("Enter Card Number");
	CardNumber.setBounds(50, 35, 110, 30);

	Label Pass = new Label("Enter Password");
	Pass.setBounds(50,110, 100, 30);

        tf1 = new TextField();    
        tf1.setBounds(50, 70, 150, 20); 
   
        tf3 = new TextField();    
        tf3.setBounds(50, 150, 150, 20);  
         
        b1 = new Button("RETRY");    
        b1.setBounds(10, 200, 100, 50); 
 
        b2 = new Button("ENTER");    
        b2.setBounds(150,200,100,50);  
  
        b1.addActionListener(this);    
        b2.addActionListener(this); 

	add(title);   
        add(CardNumber);
        add(tf1);
	add(Pass);  
        add(tf3);  
        add(b1);  
        add(b2);   
        
        setSize(300,300);    
        setLayout(null);    
        setVisible(true);    
    }  
            
     public void actionPerformed(ActionEvent e)
    {    
        String s1 = tf1.getText();  
  	String s2 = tf3.getText();  
        int a = Integer.parseInt(s1);    
        String password = "NBI1212";

        if (e.getSource() == b1)
	{    
             tf1.setText(""); 
	     tf3.setText("");   
        }  
        else if (e.getSource() == b2)
	{    
         	if(s2.equals(password))
		{
			flag=true;i=2;
		}
		else
		{
			flag=false;i=1;
		}
        }    
        
     }   

	public void paint(Graphics g)
	{
		if(i==2)
		{
			g.drawString("Valid Password",40,275);
		}
		else
		{
			g.drawString("Invalid Password Or Username",40,275);
		}
	}

}    


/*<applet code="GUIBank.class" width="300" height="300">  
</applet>*/ 