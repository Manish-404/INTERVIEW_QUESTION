package com.jspiders.typeCasting;
class A0
{
	void Run()
	{
		System.out.println("Run()..");
	}
}
class B0 extends A0
{
	void Send()
	{
		System.out.println("send()...");
	}
}
class C0 extends B0
{
	void Start()
	{
		System.out.println("Start()...");
	}
}
public class Downcasting3 {
	public static void main(String[] args)
	{
		A0 a1= new C0();
		a1.Run();
		B0 b1=(B0)a1;
		b1.Run();
		b1.Send();
		C0 c1=(C0)b1;
		c1.Run();
		c1.Send();
		c1.Start();
		C0 ref=(C0)a1;
		ref.Run();
		ref.Send();
		ref.Start();
	}
}
