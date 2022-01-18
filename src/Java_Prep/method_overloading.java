package Java_Prep;
//mathod overloading is defines as multiple parameters are using by diffrent methods with same name;

public class method_overloading {
	public static void main(String[]args)
	{
		student_marks("kumar","pass");
		student_marks("sai",99,"pass");
	}
    public static void student_marks(String name,int marks,String status)
    {
    	System.out.println(name+marks+status);	
    }
    public static void student_marks(String name,String status)
    {
    	System.out.println(name+status);
    }
}
