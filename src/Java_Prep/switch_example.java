package Java_Prep;

public class switch_example {
	public static void main(String[]args)
	{
		char day='f';
		switch(day)
		{
		case 'a':
			System.out.println("its monday");
			break;
		case 'b':
			System.out.println("its tuesday");
			break;
		case 'c':
			System.out.println("its wednesday");
			break;
		case 'd':
			System.out.println("its tuursday");
			break;
		case 'e':
			System.out.println("its friday");
			break;
		case 'f':
			System.out.println("its saturday");
			break;
		case 'g':
			System.out.println("its sunday");
			break;
		default:
			System.out.println("invalid");
			break;
		}
	}
}