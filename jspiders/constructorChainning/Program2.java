package com.jspiders.constructorChainning;
class Delta
{
	Delta(int a)
	{
		System.out.println("chennai");
	}
	Delta(int a,int b)
	{
		this (a);
		System.out.println("Madurai");
	}
	Delta(int a,int b,int c)
	{
		this(a);
		System.out.println("Combatore");
	}
}
public class Program2 {
	public static void main(String[] args)
	{
		Delta ref=new Delta(4,7);
	}
}
