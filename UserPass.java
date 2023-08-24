import java.awt.*; 
import java.applet.Applet;    
import java.awt.event.*;    
  
public class UserPass extends Applet implements ActionListener 
{    
	String msg="";
    TextField tf1, tf2, tf3;    
    Button b1, b2;   
   
    public void init()
    {  
	Label title = new Label("SET AND RESET ");
	title.setBounds(50, 1, 100, 30);

        Label input = new Label("Enter Username");
	input.setBounds(50, 35, 100, 30);

	Label output = new Label("Enter Password");
	output.setBounds(50,110, 100, 30);

	Label view = new Label("View");
	view.setBounds(50,170, 100, 30);

        tf1 = new TextField();    
        tf1.setBounds(50, 70, 150, 20); 
   
        tf2 = new TextField();    
        tf2.setBounds(50, 150, 150, 20);  
        
	tf3 = new TextField();    
        tf3.setBounds(50, 200, 150, 20);  
        tf3.setEditable(false); 

        b1 = new Button("OK");    
        b1.setBounds(10, 250, 100, 50); 
 
        b2 = new Button("RESET");    
        b2.setBounds(150,250,100,50);  
  
        b1.addActionListener(this);    
        b2.addActionListener(this); 

	add(title);
        add(input);
        add(tf1);
	add(output);  
        add(tf2);  
        add(b1);  
        add(b2);   
        add(tf3);
 	add(view);

        setSize(300,300);    
        setLayout(null);    
        setVisible(true);    
    }  
            
     public void actionPerformed(ActionEvent e)
    {    
        String s1 = tf1.getText();
	String s2 = tf2.getText();        
        msg = e.getActionCommand(); 
 
        if (e.getSource() == b1)
	{    
       		String result = s1+s2;    
        	tf3.setText(result); 
        }  
        else if (e.getSource() == b2)
	{    
            tf1.setText(""); 
	    tf2.setText(""); 
	    tf3.setText("");   
        }    
         
	repaint(); 
     }   

	public void paint(Graphics g)
	{		
		g.drawString("Button Used "+msg,50,240);
	}

}    


/*<applet code="UserPass.class" width="300" height="300">  
</applet>*/ 