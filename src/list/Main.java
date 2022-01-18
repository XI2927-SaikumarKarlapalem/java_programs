package list;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static String name;
	static int id;

	static Scanner s=new Scanner(System.in);
	static ArrayList<String>names=new ArrayList<>();
	public static ArrayList<String>  add()
	{
		System.out.println("enter a student name");
		name=s.next();
		names.add(name);
		return names;
		
	}
	public static String delete()
	{
		//for(int i=0;i<=names.size();)
		System.out.println("enter index number to be deleted");
		id =s.nextInt();
		names.remove(id);
		return "removed";
		
	}
	
	public static void display()
	{
		System.out.println(names);
	}
	public static void main(String[]args)
	{
		while(true) {
			System.out.println("enter your choice a-add,d-delete,dp='display'");
		
		String m=s.nextLine();
		if(m.equalsIgnoreCase("stop"))
		{
			break;
		}
		else if(m.equalsIgnoreCase("a"))
		{
			add();
		}
		else if(m.equalsIgnoreCase("d"))
		{
			delete();
		}
		else if(m.equalsIgnoreCase("dp"))
		{
			display();
		}
		
	}
	}
}
