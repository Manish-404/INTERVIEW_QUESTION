package com.jspiders.wrappers;

public class Program1 {
	public static void main(String[] args)
	{
		int x=243;
		Integer i1=new Integer(x);//traditional way of boxing in wrapper
		System.out.println(i1);
		
		double d=5.98;
		Double d1=d;//new way of boxing in wrappers from jdk v1.5
		System.out.println(d1);
		
		boolean b=true;
		Boolean ref=b;
		System.out.println(ref);
	}
}
