package com.jspiders.typeCasting;
class Alpha
{
	int num=15;
	void test()
	{
		System.out.println("Ëxecuting test()...");
	}
}
class Beta extends Alpha
{
	int val=25;
	void disp()
	{
		System.out.println("Executing disp()...");
	}
}
public class Program2 {
	public static void main(String[] args)
	{
		Beta b=new Beta();
		System.out.println(b.num);
		b.test();
		System.out.println(b.val);
		b.disp();
		Alpha a=b;
		System.out.println(a.num);
		a.test();
	}

}
