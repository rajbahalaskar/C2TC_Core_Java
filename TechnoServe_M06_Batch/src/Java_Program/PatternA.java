package Java_Program;
import java.util.Scanner;
public class PatternA {

	void display(int n)
	{
	for(int i=0; i<=n;i++)
	{
		for(int j=0; j<=n/2; j++)
		{
			if(j==0||j==n/2 && i!=0|| i==0 && j!=n/2|| i==n/2)
System.out.println("*");
else
	System.out.println("");
		}
		System.out.println();
	}

	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		PatternA a= new PatternA();
		a.display(7);
	}

}
