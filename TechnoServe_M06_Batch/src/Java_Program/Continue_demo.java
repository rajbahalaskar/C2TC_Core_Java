package Java_Program;
import Rajesh.*;
public class Continue_demo 
{

	public static void main(String[] args) 
	{
	int x=0;
	do
	{	x++;
		System.out.println(x);
			if(++x<5)
				continue;
			x++;
			System.out.println(x);
	
		} while(++x<10);
	}
}


