package com.jspiders.passingObjects;

class Employee
{
	int id;
	double sal;
}

class Manager
{
	static void viewEmployeeProfile(Employee e)
	{
		System.out.println("ID:"+e.id);
		System.out.println("Salary:"+e.sal);
	}
}

public class Program3
{
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.id=15242;
		e1.sal=2000;
		Manager.viewEmployeeProfile(e1);
		
		Employee e2=new Employee();
		e2.id=1555;
		e2.sal=2500;
		Manager.viewEmployeeProfile(e2);
	}
}