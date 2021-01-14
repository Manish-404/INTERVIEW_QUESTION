package com.jspiders.typeCasting;
class Demo
{
	
}
class Sample extends Demo
{
	
}
public class Program1 {
	public static void main(String[] args)
	{
		Sample s=new Sample();
		Demo d=s;//UPCASTING
		System.out.println(s);
		System.out.println(d);
	}

}
