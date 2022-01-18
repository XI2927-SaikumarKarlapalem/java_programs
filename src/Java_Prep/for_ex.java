package Java_Prep;

public class for_ex {
	public static void main(String[]args)
	{
		for(int i=1;i<=10;i++)
		{
			double a=amountcalc(10000,i);
			System.out.println(a);
		}
		
	}
	public static double amountcalc(long amount,long intrest)
	{
		return (amount)*(intrest%100);
		
	}

}
