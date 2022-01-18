import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class even_odd {
	public static void main(String[] args)
	{
		int a;
		List<Integer> even_list=new ArrayList<Integer>();
		List<Integer> odd_list=new ArrayList<Integer>();
	 
	 do {
		 Scanner scan=new Scanner(System.in);	
		  System.out.println("please enter a number to be stored");
		   a=scan.nextInt();
		   if(a==1000)
		   {
			   System.out.println("thanks for playing ");
		   }
		   else  if(a%2==0)
			  {
				  System.out.println("yeah,you entered an even number");
				  even_list.add(a);
				  
			  }
			  else {
				  System.out.println("yeah,you entered an odd number");
				  odd_list.add(a);
			  }
	 }while(a!=1000);
	 System.out.println("even numbers"+even_list);
	 System.out.println("odd numbers"+odd_list);
	 
		 
	

	}
}
