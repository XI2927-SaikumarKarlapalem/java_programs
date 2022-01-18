
public class fibonacci {
	public static void main(String[]args)
	{
		int n=0;
		int n1=1;
		System.out.println(n);
		System.out.println(n1);
		for(int i = 0;i<=5;i++)
		{
			int c=n+n1;
			System.out.println(c);
			n=n1;
			n1=c;
		}
	}

}
