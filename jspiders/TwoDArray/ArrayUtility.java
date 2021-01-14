package com.jspiders.TwoDArray;
import java.util.Scanner;
public class ArrayUtility
{
{
	int[][] arr=createArray();
	displayArray (arr);
}
static int[][] createArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows");
		int rows=sc.nextInt();
		System.out.println("Enter coloumns");
		int cols=sc.nextInt();
		
		int[][] arr=new int[rows][cols];
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println("Enter values for row:"+i);
			 for(int j=0;j<arr[i].length;j++)
			 {
				 arr[i][j]=sc.nextInt();
			 }
		 }
		 return arr;
	}
static void displayArray (int[][] arr)
{
	System.out.println("The array elements are:");
	for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	
}
}
	
