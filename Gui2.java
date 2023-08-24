import javax.swing.*;
import java.awt.*;
 
public class Gui2
{

   public static void main(String args[])
	{
	JFrame f = new JFrame("Gui2");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(400,400);
	
	  JMenuBar mb = new JMenuBar();  
          JMenu menu = new JMenu("MENU");
		JMenuItem file = new JMenuItem("File");  
          JMenu help = new JMenu("HELP") ;

	JLabel l1 = new JLabel("Enter Text : ");
	l1.setBounds(50,50, 200, 40);

	JButton b1 = new JButton("SEND");
	b1.setBounds(40,250,100,50);

	JButton b2 = new JButton("RESET");
	b2.setBounds(150,250,100,50);

	JTextField tf1 = new JTextField();
	tf1.setBounds(50,100,150,30);

	JTextField tf2 = new JTextField();
	tf2.setBounds(50,150,150,30);
	
	menu.add(file);
	mb.add(menu);  
	mb.add(help);
        f.setJMenuBar(mb);  
	f.add(tf2);
	f.add(tf1);
	f.add(l1);
	f.add(b2);
	f.add(b1);
	f.setLayout(null);  
	f.setVisible(true);
	}

}
