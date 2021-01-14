package com.jspiders.passingObjects;

class Student
{
	String name;
	double id;
}

class Councillor
{
	static void displayDetails(Student s)
	{
		System.out.println("Name:"+s.name);
		System.out.println("ID:"+s.id);
	}
}

public class Program2
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.name="Manish";
		s1.id=15242.0;
		Councillor.displayDetails(s1);
	}
}