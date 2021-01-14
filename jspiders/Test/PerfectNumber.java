package com.jspiders.Test;
public class PerfectNumber {
	public static void main(String[] args)
	{
		int num=28;
		int a =1;
		int sum=0;
		while(a<=num/2)
		{
			if(num%a==0)
			{
				sum=sum+a;
			}
			a++;
		}
		String s=num==sum?"Perfect":"not Perfect";
		System.out.println(s);
	}
}
