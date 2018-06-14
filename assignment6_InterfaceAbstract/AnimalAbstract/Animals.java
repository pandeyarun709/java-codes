package assignment6_InterfaceAbstract.AnimalAbstract;

public abstract class Animals {
	
	String colour;
	String breed;
	String name;
	
	
	
	void speak()
	{
		System.out.println("Animals Speaking !!!");
		
	}
	
	abstract void eat();
	

}
