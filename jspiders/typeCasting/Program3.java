package com.jspiders.typeCasting;
class Delta
{
	void play()
	{
		System.out.println("Executing play()...");
	}
}
class Example extends Delta
{
	void run()
	{
		System.out.println("Executing run()...");
	}
}
public class Program3 {
	public static void main (String[] args)
	{
		Delta ref=new Example();//UPCASTNG
		ref.play();
	}

}
