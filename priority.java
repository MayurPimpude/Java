import java.util.*; 
   
class priority 
{ 
    public static void main(String args[])
  { 
       int i;
	String str;
	Scanner sc = new Scanner(System.in);
        PriorityQueue<String> priority = new PriorityQueue<String>(); 
        do
	{
         System.out.println("Enter Element : "); 
	 str = sc.nextLine();
		priority.add(str);
	 System.out.println("Do you want to continue : ");
	 i = sc.nextInt();
        }while(i!=1);
   }
}