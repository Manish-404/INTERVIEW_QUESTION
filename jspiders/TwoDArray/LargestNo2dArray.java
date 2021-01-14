package com.jspiders.TwoDArray;
//Smallest value in each Row
public class LargestNo2dArray 
{
	public static void main (String[] args)
	{
		int[][] arr=ArrayUtility.createArray();
		ArrayUtility.displayArray(arr);
		for (int i=0;i<arr.length;i++)
		{
			int small=arr[i][0];
			for(int j=0;j<arr[i].length;j++)
			{
				if(small>arr[i][j])
				{
					small=arr[i][j];
				}
			}
			System.out.println("Smallest value in row "+i+" is "+small);
		}
	}
}
