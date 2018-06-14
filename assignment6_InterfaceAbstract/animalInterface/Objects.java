package assignment6_InterfaceAbstract.animalInterface;

public class Objects {

	public static void main(String [] args ) 
	{
		Animal cat = new Cat();
		
		cat.speak();
		cat.eat();
		
		Animal dog = new Dog();
		
		dog.speak();
		dog.eat();
	}
}
