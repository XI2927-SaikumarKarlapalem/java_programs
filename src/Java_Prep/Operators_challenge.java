package Java_Prep;

public class Operators_challenge {
	public static void main(String[]args)
	{
		double a=20d;
		double b=80d;
		double total=(a+b)*(100d);
		double remainder=total%40d;
		System.out.println(total);
		boolean check_remainder=(remainder==0)?true:false;
		if(!check_remainder)
		{
			System.out.println("got the remainder");
		}
		else
		{
			System.out.println("success");
		}
		
	}

}
