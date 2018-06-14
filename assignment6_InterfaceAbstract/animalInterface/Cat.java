package assignment6_InterfaceAbstract.animalInterface;

public class Cat implements Animal{
	
	@Override
	public void speak()
	{
		System.out.println("I am a Cat, I speak Meow Meow");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
		System.out.println("I like milk");
	}
	
	

}
