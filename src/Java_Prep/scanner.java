package Java_Prep;

import java.util.Scanner;

public class scanner {
	public static void main(String[]args)
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your name:");
		String name=scan.nextLine();
		System.out.println("your good name is:"+name);
		System.out.println("enter your birthyear:");
		int birthyear=scan.nextInt();
		System.out.println(2022-birthyear);
	}

}
