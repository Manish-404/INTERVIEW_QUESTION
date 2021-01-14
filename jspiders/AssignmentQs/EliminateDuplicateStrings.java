package com.jspiders.AssignmentQs;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class EliminateDuplicateStrings 
{
	public static void main(String[] args)
	{
			String str="My Name is an Analog Circuit is the Circuit name that has been in the an Dialog";
			String[] a=str.split(" ");
			LinkedHashSet lhs=new LinkedHashSet();
			for(int i=0;i<a.length;i++)
			{
				String s=a[i]+" ";
				lhs.add(s);
			}
			Iterator itr=lhs.iterator();
			while(itr.hasNext())
			{
				System.out.print(itr.next());
			}
	}
}
