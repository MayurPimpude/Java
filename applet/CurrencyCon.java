import java.awt.*; 
import java.applet.Applet;    
import java.awt.event.*;    
  
public class CurrencyCon extends Applet implements ActionListener 
{    
    String msg="";
    TextField tf1, tf2, tf3;    
    Button b1, b2;   
   
    public void init()
    {  
	Label title = new Label("CURRENCY CONVETER");
	title.setBounds(60,1, 200, 40);
	
        Label input = new Label("Enter Amount");
	input.setBounds(50, 35, 100, 30);

	Label output = new Label("Converted In ==");
	output.setBounds(50,110, 100, 30);

        tf1 = new TextField();    
        tf1.setBounds(50, 70, 150, 20); 
   
        tf3 = new TextField();    
        tf3.setBounds(50, 150, 150, 20);  
        tf3.setEditable(false);  
 
        b1 = new Button("INR TO USD");    
        b1.setBounds(10, 200, 100, 50); 
 
        b2 = new Button("USD TO INR");    
        b2.setBounds(150,200,100,50);  
  
        b1.addActionListener(this);    
        b2.addActionListener(this); 

	add(title);   
        add(input);
        add(tf1);
	add(output);  
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
        double a = Double.parseDouble(s1);      
        double c = 0;  
	msg=e.getActionCommand(); 
 
        if (e.getSource() == b1)
	{    
            c = a/(74.26);    
        }  
        else if (e.getSource() == b2)
	{    
            c = a*(74.26) ;    
        }    
        String result = String.valueOf(c);    
        tf3.setText(result);   
	repaint(); 
     }   

	public void paint(Graphics g)
	{
		g.drawString(msg,150,130);
		g.drawString("Current Rate $1 = 74.26 rs",40,275);
	}

}    


/*<applet code="CurrencyCon.class" width="300" height="300">  
</applet>*/ 