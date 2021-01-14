package com.jspiders.constructorChainning;
class Alpha
{
	Alpha()
	{
		System.out.println("Alpha() constructor");
	}
}
class Beta extends Alpha
{
	Beta()
	{
		System.out.println("Beta() constructor");
	}
}
public class Program4 {
	public static void main(String[] args)
	{
		Beta B=new Beta(); 
	}

}
