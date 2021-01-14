package com.jspiders.typeCasting;
class Demo1
{
	
}
class Sample1 extends Demo1
{
	
}
public class Downcasting {
	public static void main(String[] args) {
		Demo1 d=new Sample1();
		Sample1 s=(Sample1)d;
		System.out.println(d);//DOWNCASTING
		System.out.println(s);
	}
}
