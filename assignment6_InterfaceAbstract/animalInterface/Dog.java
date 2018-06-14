package assignment6_InterfaceAbstract.animalInterface;

public class Dog implements Animal {

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		
		System.out.println("I am a Dog, I speak Woof Woof");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
		System.out.println("I like Meat");
	}

}
