import java.util.*;

class SwapNumbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("A:");

		int a=sc.nextInt();
		System.out.print("B:");
		int b=sc.nextInt();
		int c=a;
		a=b;
		b=c;
		System.out.println("A:"+a+" B: "+b);
	}
}

		
		
		