package Arrays;

import java.util.Scanner;

public class DemoArray {
	
	public static void main(String[]args)
	{
		int[] arr1= {1,2,3,4,5,6,7,8};
		printArray(arr1);
	}

	private static void printArray(int[] arr1) {
		for(int i=0;i<=arr1.length;i++)
			{
			System.out.println(arr1[i]);
			};
		
	}
}
