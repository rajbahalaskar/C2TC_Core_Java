package Java_Program;

public class String1 {

	public static void main(String[] args)
	
	{
		String s=new String("RAJESH");		
		
		System.out.println(s.length());
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s.toUpperCase());
		
		String s1="KHANDALA";
		System.out.println(s1.equals("khandala"));
		
		System.out.println(s1.equalsIgnoreCase("khandala"));
		
		System.out.println(s1.replace('K', 'A'));
		
		System.out.println(s.trim());
		
		System.out.println(s.substring(2));
		
		
		
	}

}
