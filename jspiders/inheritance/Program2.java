package com.jspiders.inheritance;
class Whatsapp1
{
	void messenger()
	{
		System.out.println("Send Messages");
	}
}
class Whatsapp2 extends Whatsapp1
{
	void call() {
		System.out.println("Makes Call");
	}
}
class Whatsapp3 extends Whatsapp2
{
	void status() {
		System.out.println("Depecting Feelings");
	}
}
public class Program2 {
	public static void main(String[] args)
	{
		Whatsapp3 ref=new Whatsapp3();
		ref.messenger();
		ref.call();
		ref.status();
	}

}
