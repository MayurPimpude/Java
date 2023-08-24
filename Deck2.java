import java.util.*;


class Deck2 
{





static void Decker()
{
	int i,j,k;

	System.out.println("---------------------------------------------");
	System.out.println("Display Deck : ");
	System.out.println("---------------------------------------------\n");
	String deck[]=new String[56];
 

	
String[] Value={"0","1","2","3","4","5","6","7","8","9","+2","Skip","Rev","Draw2"};

	String[] Colour={"R","Y","B","G"};



	//createDeck

	for(i=0;i<4;i++)

	{
      
	for(j=(i+1)*14 - 14;j<(i+1)*14;j++)

 	  {
   
         deck[j] = Colour[i%4] + Value[j%14];
   
  	  }
 
 	}





for(k=0;k<56;k++)

  {
   
	System.out.println(deck[k]);
 
  }


Random rand = new Random();
    
  
        for(i=0; i<56; i++)
 
  {
       
	j = rand.nextInt(52);
          
	String temp = deck[i];
           
	deck[i]=deck[j];
           
	deck[j]= temp;
    
  }


System.out.println("---------------------------------------------");
	System.out.println("After shuffling : ");

System.out.println("---------------------------------------------\n");

//display of shuffled deck
for(k=0;k<56;k++)
  
  {
  
 	System.out.println(deck[k]);

  }

System.out.println("---------------------------------------------");
}

public static void main(String[] args)

{


Scanner sc = new Scanner(System.in); 
System.out.println("---------------------------------------------");
System.out.println("\tUNO GAME\n");
System.out.println("\nPlayer One...");
System.out.println("Enter Name : CPU");
String name ="CPU";

System.out.println("\nPlayer Two...");
System.out.print("Enter Name : ");
String name2 = sc.nextLine();
System.out.println("---------------------------------------------\n");

Deck2.Decker();


}
}