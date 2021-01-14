package com.jspiders.constructorChainning;
class Omega
{
	Omega(int a)
	{
		System.out.println("Java");
	}
	Omega(double d)
	{
		this(10);
		System.out.println("Sql");
	}
	Omega(String s)
	{
		this(4.2);
		System.out.println("J2ee");
	}
}
public class Program1 {
	public static void main (String[] args)
	{
		Omega ref=new Omega("ABC");
	}

}
