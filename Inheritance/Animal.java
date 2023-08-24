/*multilevel herirarchy*/

class Animal
{  
Animal()
	{
	System.out.print("Animal");
	}

void eat()
	{
	System.out.println("eating...");
	}  
}  

class Dog extends Animal
{ 
Dog()
	{
	System.out.print("Dog");
	}
 
void bark()
	{
	System.out.println("barking...");
	}  
}  
class BabyDog extends Dog
{  
BabyDog()
	{
	System.out.print("BabyDog");
	}

void weep()
	{
	System.out.println("weeping...");
	}  
}  

class TestInheritance2
{  
public static void main(String args[])
	{  
	BabyDog d=new BabyDog();  
	d.weep();  
	d.bark();  
	d.eat();  
	}
}  
