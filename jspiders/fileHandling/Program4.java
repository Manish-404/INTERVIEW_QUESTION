package com.jspiders.fileHandling;
import java.io.FileWriter;
import java.io.IOException;
public class Program4 {
	public static void main(String[] args)
	{
		FileWriter fw=null;
		try
		{
			fw=new FileWriter("D:/FILEIO/Demo.txt");
			fw.write("ABC");
			fw.write("\n");
			fw.write("abc");
			fw.flush();
			System.out.println("IO Exception");
		}
		catch(IOException e)
		{
			System.out.println("IOException");
		}
		finally
		{
			try {
				fw.close();
			}
			catch(IOException e)
			{
				System.out.println("IO Exception");
			}
		}
	}
}
