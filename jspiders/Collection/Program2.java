package com.jspiders.Collection;
import java.util.LinkedHashSet;
//Removing Duplicate values from the array
public class Program2 
{
	//this code will be Read only in amcat exams
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,6,7,8,9,4,8};
		removeDuplicates(arr);
	}
	//Do coding here in amcat
	static void removeDuplicates(int[] arr)
	{
		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			hs.add(arr[i]);
		}
		int[] res=new int[hs.size()];//Creating an array with same size as LinkedHashSet
		int s=0;
		for(int i:hs)
		{
			res[s]=i;
			s++;
		}
		for(int i=0;i<res.length; i++)
		{
			System.out.println(res[i]);
		}
	}
}
