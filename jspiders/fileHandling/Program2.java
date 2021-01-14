package com.jspiders.fileHandling;
import java.io.File;
import java.io.IOException;
public class Program2 {
	public static void main(String[] args)
	{
		File ref=new File("D:/FILEIO/Demo.txt");
		boolean b=ref.exists();
		if(b==false)
		{
			try
			{
				ref.createNewFile();
				System.out.println("File Created");
			}
			catch(IOException e)
			{
				System.out.println("Failed to create file");
			}
		}
		else
		{
			System.out.println("File exists");
		}
	}
}
