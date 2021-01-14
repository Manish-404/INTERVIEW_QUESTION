package com.jspiders.cframes;
import java.util.ArrayList;
import java.util.Iterator;
public class Program1 
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		Student s=new Student();
		Employee e=new Employee();
		Actor a=new Actor();
		Mobile m=new Mobile();
		Vehicle v=new Vehicle();
		al.add(e);
		al.add(s);
		al.add(m);
		al.add(v);
		al.add(a);
		Iterator itr=al.iterator();
		System.out.println("Retrival".get(2));
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
