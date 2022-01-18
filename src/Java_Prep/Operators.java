package Java_Prep;

public class Operators {
	public static void main(String[]args)
	{
		int a=10;
		float b=20f;
		double c=1999d;
		var result=(float) (a+b+c);
		System.out.println("a+b+c=="+result);
		result+=12;
		result*=18;
		System.out.println(result);
		result++;
		result--;
		System.out.println(result);
	}

}
