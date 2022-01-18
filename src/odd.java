import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class odd {
	public static void main(String[]args)
	{
		
		List<Integer> even_list=new ArrayList<Integer>();
		List<Integer> odd_list=new ArrayList<Integer>();
		int number;
		do {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter an even number");
			number=scan.nextInt();
			if(number%2!=0)
			{
				odd_list.add(number);
			}
			else if(number%2==0)
			{
				even_list.add(number);
				int sum=0;
				for(int odd:odd_list)
				{
					sum=sum+odd;
					
				}System.out.println(odd_list);
				System.out.println("sum of odd list is "+(sum+number));
			}
				}while(number%2!=0);
		

}
}
