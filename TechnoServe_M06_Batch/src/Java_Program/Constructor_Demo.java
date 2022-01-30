package Java_Program;

public class Constructor_Demo {
	
	
	String name;
	int roll;
	
	Constructor_Demo(String name, int roll)
	{
		this.name=name;
		this.roll=roll;
	}
	
	
	public static void main(String[] args) 
	{
		
		Constructor_Demo s1=new Constructor_Demo("Rajesh",101);
		Constructor_Demo s2= new Constructor_Demo("Varun",102);
		
		
		
		System.out.println(s1.name+" "+s1.roll);
		System.out.println(s2.name+" "+s2.roll);

	}

}
