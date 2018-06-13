package assignment5_Inheritence;

public class Static_Block {
	
	static float num1;
	static int num2;
	int num3;
	
	static {// Static block are use to initialization of static variable
		
		num1 = 2.55f;
		System.out.println("Static block 1 initialization of Float static variable.");
	}
	
    static {
		
		num2 = 20;
		System.out.println("Static block 2 initialization of Int static variable.");
	}
    
    
    public static void main(String [] args)
    {
    	System.out.println("Int type static variable num2 = "+ Static_Block.num2);
    	
    	System.out.println("Float type static variable num1 = "+ Static_Block.num1);
    }
}
