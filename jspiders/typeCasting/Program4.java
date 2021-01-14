package com.jspiders.typeCasting;
class A
{
	void Test()
	{
		System.out.println("test()...");
	}
}
class B extends A
{
	void Disp()
	{
		System.out.println("Disp()..");
	}
}
class C extends B
{
	void Play()
	{
		System.out.println("Play()...");
	}
}
public class Program4 {
	
	public static void main (String[] args)
	{
		C c1=new C();
		c1.Test();
		c1.Disp();
		c1.Play();
		B b1=c1;
		b1.Test();
		b1.Disp();
		A a1=b1;
		a1.Test();
		A ref=new C();
		ref.Test();
	}
}
