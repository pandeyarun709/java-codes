package assignment6_InterfaceAbstract.AnimalAbstract;

public class Cat extends Animals {
	
	Cat(String colour , String breed , String name)
	{
		this.colour = colour ;
		this.breed =  breed ;
		this.name = name ;
		
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		
		System.out.println("I love Milk !!");
	}
	
	void display() {
		System.out.println("Name : "+ name);
		System.out.println("Colour : "+ colour);
		System.out.println("Breed : "+ breed);
	}
	
	
	public static void main(String [] args)
	{
		
       Animals cat = new Cat("CAty","Brown","Indian");
       
       cat.speak();
       cat.eat();
       
     Cat c = new Cat("CAty","Brown","Indian");
		c.display();

	}

}
