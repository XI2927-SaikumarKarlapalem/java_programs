package Java_Prep;

public class IF_ELSE {
	
	public static void main(String[]args)
	{
		int marks=88;
		if(marks<=35)
		{
			System.out.println("congrats you are passed");
			
		}
		else if(marks>=70 && marks<=85)
		{
			System.out.println("congrats you are in first class");
		}
		else if(marks>=86 || marks<90 && marks<100)
		{
			System.out.println("congrats you got distinction");
		}
		
	}

}
