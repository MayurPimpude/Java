import javax.swing.*;
public class Gui
{

   public static void main(String args[])
	{
	JFrame frame = new JFrame("My Swing GUI");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300,300);
	JButton button = new JButton("press");
	frame.getContentPane().add(button);
	frame.setVisible(true);
	}

}
