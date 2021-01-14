package com.jspiders.passingObjects;

class Product 
{
	int pid;
	double price;
}

class ProductUtility
{
	static void displayDetails(Product p)
	{
		System.out.println("PRODUCT ID:"+p.pid);
		System.out.println("PRODUCT price:"+p.price);
	}
}

public class Program1
{
	public static void main(String[] args)
	{
		Product p1=new Product();
		p1.pid=101;
		p1.price=4500.0;
		ProductUtility.displayDetails(p1);
	}
}