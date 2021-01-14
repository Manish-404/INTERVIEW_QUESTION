package com.jspiders.AssignmentQs;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class EliminateDuplicates 
{
	public static void main(String[] args)
	{
			String str="abcedabcdefabdcacbd";
			char[] ch=str.toCharArray();
			LinkedHashSet lhs=new LinkedHashSet();
			for(int i=0;i<ch.length;i++)
			{
				lhs.add(ch[i]);
			}
			Iterator itr=lhs.iterator();
			while(itr.hasNext())
			{
				System.out.print(itr.next());
			}
	}
	
}
