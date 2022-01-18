package Java_Prep;

public class check_odd {
	public static void main(String[]args)
	{
		for(int i=0;i<=1000;i++)
		{
			int k=odd(i);
			System.out.println(k);
		}
	}
    public static int odd(int n)
    {
    	if(n%2!=0) {
                return n;
    	     }
    	return 0;
		
    }
}
