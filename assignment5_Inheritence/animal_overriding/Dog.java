package assignment5_Inheritence.animal_overriding;

public class Dog extends Animal {
	
	@Override
	void getAnimalDetal()
	{
		
		
		System.out.println("Enter the breed of dog ");
		
		breed = sc.nextLine();
		
		System.out.println("Enter the Colur of dog ");
		
		colur = sc.nextLine();
		
	}
	

	@Override
	void speak()
	{	System.out.println("Dog : ");
		System.out.println("Dog speak woof");
		System.out.println("Breed : " + breed);
		System.out.println("Colur : " + colur);
		
	}
}
