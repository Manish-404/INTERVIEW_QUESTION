package com.jspiders.fileHandling;
import java.io.File;
//create a folder
public class Program1 {
	public static void main(String[] args)
	{
		File ref=new File("D:/FILEIO");
		boolean b=ref.exists();
		if(b==false)
		{
			ref.mkdir();
			System.out.println("Folder Created");
		}
		else
		{
			System.out.println("Folder Already Exists");
		}
	}
}
