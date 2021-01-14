package com.jspiders.typeCasting;
class Alpha1
{
	int num=15;
	void test()
	{
		System.out.println("Executing test()..");
	}
}
class Beta1 extends Alpha1
{
	int val=25;
	void disp()
	{
		System.out.println("Executing disp()..");
	}
}
public class Downcasting2 {
	public static void main(String[] args)
	{
		Alpha1 a=new Beta1();
		System.out.println("a.num");
		a.test();
		Beta1 b=(Beta1)a;//DOWNCASTING
		System.out.println("b.num");
		b.test();
		System.out.println("b.val");
		b.disp();
	}

}
