package Java_Program;
import java.util.Scanner;
public class Pattern2
{
public static void main(String args[])
{
int n, i, j, rs= 1;
System.out.print("Enter the number of rows: ");
Scanner s = new Scanner(System.in);
n = s.nextInt();
rs = n - 1;
for (j = 1; j<= n; j++)
{
for (i = 1; i<=rs; i++)
{
System.out.print(" ");
}
rs--;
for (i = 1; i <= 2 * j - 1; i++)
{
System.out.print("*");
}
System.out.println("");
}
rs = 1;
for (j = 1; j<= n - 1; j++)
{
for (i = 1; i<= rs; i++)
{
System.out.print(" ");
}
rs++;
for (i = 1; i<= 2 * (n - j) - 1; i++)
{
System.out.print("*");
}
System.out.println("");
}
}
}