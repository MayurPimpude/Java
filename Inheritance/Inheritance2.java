//mutlilevel//
class Animal
{  
Animal()
	{
	System.out.print("\nAnimal");
	}

void eat()
	{
	System.out.println("\neating...");
	}  
}  

class Dog extends Animal
{ 
Dog()
	{
	System.out.print("\nDog");
	}
 
void bark()
	{
	System.out.println("\nbarking...");
	}  
}  

class BabyDog extends Dog
{  
BabyDog()
	{
	System.out.print("\nBabyDog");
	}

void weep()
	{
	System.out.println("\nweeping...");
	}  
}  

class Inheritance2
{  
public static void main(String args[])
	{  
	BabyDog d=new BabyDog();  
	d.weep();  
	d.bark();  
	d.eat();  
	}
}  
