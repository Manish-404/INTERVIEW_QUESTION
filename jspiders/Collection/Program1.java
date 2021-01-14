package com.jspiders.Collection;
import java.util.HashSet;
public class Program1 
{
	static boolean searchElement(HashSet<Integer> hs,int element)
	{
		return hs.contains(element);
	}
	//offlimits
	public static void main(String[] args)
	{
		HashSet<Integer> hs=new HashSet<Integer>();
		
		hs.add(45);
		hs.add(24);
		hs.add(56);
		hs.add(15);
		hs.add(87);
		
		boolean res=searchElement(hs, 56);
		System.out.println("Element found: "+res);
	}
}

	
