import java.awt.*;  
class MenuExample  
{  
        MenuExample()
	{  
         Frame f= new Frame("Menu and MenuItem Example");  
         MenuBar mb=new MenuBar();  
         Menu A=new Menu("A");
	 Menu B=new Menu("B");  
         Menu submenu=new Menu("Sub Menu");  
         MenuItem b1=new MenuItem("Item b1");  
         MenuItem b2=new MenuItem("Item b2");  
         MenuItem b3=new MenuItem("Item b3");  
         MenuItem a4=new MenuItem("Item a4");  
         MenuItem a5=new MenuItem("Item a5");  
         B.add(b1);  
         B.add(b2);  
         B.add(b3);  
	 A.add(a4);  
         A.add(a5);  
         
         B.add(submenu);  
	 A.add(submenu);  
         mb.add(B);
	 mb.add(A);  
         f.setMenuBar(mb);  
         f.setSize(400,400);  
         f.setLayout(null);  
         f.setVisible(true);  
	}  

	public static void main(String args[])  
	{  
		new MenuExample();  
	}  
}  