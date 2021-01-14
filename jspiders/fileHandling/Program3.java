package com.jspiders.fileHandling;
import java.io.File;
public class Program3 {
	public static void main(String[] args)
	{
		File ref=new File("D:/FILEIO/Demo.txt");
		boolean b=ref.exists();
		if(b==true)
		{
			ref.delete();
			System.out.println("Deleted");
		}
		else
		{
			System.out.println("Not found");
		}
	}
}

