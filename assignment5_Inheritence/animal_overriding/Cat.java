package assignment5_Inheritence.animal_overriding;

public class Cat extends Animal{
	
	@Override
	void getAnimalDetal()
	{
		
		
		System.out.println("Enter the breed of cat ");
		
		breed = sc.nextLine();
		
		System.out.println("Enter the Colur of cat ");
		
		colur = sc.nextLine();
		//sc.close();
	}
	
	@Override
	void speak()
	{
		System.out.println("Cat : ");
		System.out.println("Cat speek Meow");
		System.out.println("Breed : " + breed);
		System.out.println("Colur : " + colur);
		System.out.println();
		
	}

}
