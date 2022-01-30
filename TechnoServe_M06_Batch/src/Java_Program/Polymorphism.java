package Java_Program;
class Cal
{
int add(int x, int y)
{
return x+y;
}
int add(int x, int y, int z) 
{
return x+y+z;
}
}
public class Polymorphism
{
public static void main(String args[])
{
Cal obj = new Cal();
System.out.println(obj.add(100, 200));
System.out.println(obj.add(100, 200, 300));
}
}