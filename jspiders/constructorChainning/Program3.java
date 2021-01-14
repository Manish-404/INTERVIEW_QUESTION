package com.jspiders.constructorChainning;
class Demo
{
	Demo()
	{
		System.out.println("Demo() constructor");
	}
	Demo(int a)
	{
		System.out.println("Demo(int) constructor");
	}
}
class Sample extends Demo
{
	Sample()
	{
		super();
		System.out.println("Sample() Constructor");
	}
}
public class Program3 {
	public static void main(String[] args)
	{
		Sample ref=new Sample();
	}
}
