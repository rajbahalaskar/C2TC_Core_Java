package Java_Program;
interface A
{
	abstract void A_display();
	
	
}
interface B
{
	void B_display();
	
}

class MIE implements A,B
{
	public void A_display()
	{
		System.out.println("I am A");
	}
	public void B_display()
	{
		System.out.println("I am B");
	}
}


public class Multiple_Inheritance {
	public static void main(String[] args)
	{
		MIE obj=new MIE();
		obj.A_display();
		obj.B_display();
	}

}
