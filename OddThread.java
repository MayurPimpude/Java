import java.util.*;
import java.lang.Runnable;

class Fibo implements Runnable
{  
int n1=0,n2=1,n3,j;
 public void run()
{
System.out.println("Fibonacci Series : ");  
 System.out.print(n1);  
for(j=0;j<15;++j)    
 {    
  n3=n1+n2;    
  System.out.print(" ,"+n3);    
  n1=n2;    
  n2=n3;    
 }    	
	
}
}

class Odd implements Runnable
{  

@Override
synchronized public void run()
{  
int i;
System.out.println("Odd Number from 1 to 20 are :");
for(i=1;i<=20;i++)
{
if(i%2!=0)
System.out.println(i);
}  
}  
}  


class OddThread
{  
public static void main(String args[])
{  

Thread t1 = new Thread(new Fibo());  
Thread t2 = new Thread(new Odd());
t1.setPriority(1);  
//t2.setPriority(10);  
t1.start();  
t2.start();  
}  
}  
