package Java_Program;
import java.util.Scanner;
public class npran {
	public static int fact(int num)
	{
		int fact=1,i;
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
public static void main(String args[])
{
int n,r;
Scanner scan=new Scanner (System.in);
System.out.println("Enter value of n:");
n=scan.nextInt();
System.out.println("Enter value of r:");
r=scan.nextInt();
System.out.print("NCR="+(fact(n)/fact(n-r)*fact(r)));
System.out.print("NPR =" +(fact(n)/(fact(n-r))) );
}
}
