import java.util.*;

public class AddNumber
	{
	public static void main(String args[])
		{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter 1st");
		String s1=ss.nextLine();
		System.out.println("Enter 1st");
		String s2=ss.nextLine();
		
		if(s1.contains(".") || s2.contains("."))
			{
			add1(s1,s2);
			}
		else 
			{
			add2(s1,s2);
			}
		}
	public static void add1(String a,String b)
		{
		try{
		double x=Double.parseDouble(a);
		double y=Double.parseDouble(b);
		System.out.println(x+y);
		}catch(Exception ee)
			{add3(a,b);} 
		}
	public static void add2(String a,String b)
		{
		try{
		int x=Integer.parseInt(a);
		int y=Integer.parseInt(b);
		System.out.println(x+y);
		}catch(Exception ee)
			{add3(a,b);} 
		}
	public static void add3(String a,String b)
		{
		System.out.println(a+b);
		}
	}
