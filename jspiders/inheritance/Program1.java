package com.jspiders.inheritance;

class Instagram1 {
	void postPhotos()
	{
		System.out.println("Upload Pics");
	}
}
class Instagram2 extends Instagram1
{
	void directMessenger()
	{
		System.out.println("Send Message");
	}
}
public class Program1
{
	public static void main(String[] args)
	{
		Instagram2 ref=new Instagram2();
		ref.postPhotos();
		ref.directMessenger();
	}
}