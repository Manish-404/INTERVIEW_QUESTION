package com.jspiders.StringBufferandBuilder;

public class Program2 {
	public static void main(String[] args)
	{
		StringBuffer sb1=new StringBuffer("A");
		System.out.println(sb1.toString());
		System.out.println(sb1.hashCode());
		StringBuilder sb2=new StringBuilder("a");
		System.out.println(sb2.toString());
		System.out.println(sb2.hashCode());
	}
}
