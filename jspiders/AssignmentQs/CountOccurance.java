package com.jspiders.AssignmentQs; 
public class CountOccurance {
	public static void main(String[] args)
	{
		String str="abcedabcdefabdcacbd";
		char[] ch=str.toCharArray();
		char a='a';
		for(int i=0;i<26;i++)
		{
			int count=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[j]==a)
				{
					count++;
				}
			}
			if(count!=0)
			{
				System.out.println(a+""+count);
			}
			a++;
		}
	}
}
