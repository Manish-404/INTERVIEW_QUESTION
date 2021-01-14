package com.HizliInterview.Task;

import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task1 {
	public static void main(String[] args) throws IOException {

		String inputHTMLTags = new String(Files.readAllBytes(Paths.get("D:\\htmlFile[18958].txt")));
//		System.out.println(inputHTMLTags);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to enter the line number or 2 to enter the tag name:");
		int userInput1 = sc.nextInt();
		
		switch(userInput1) {
			case 1:
				System.out.println("Enter the line number:");
				int lineNumber = sc.nextInt();
				findchildUsingLineNumber(inputHTMLTags, lineNumber);
				break;
			case 2:
				System.out.println("Enter the tag name:");
				sc.nextLine();
				String tagName = sc.nextLine();
				findchildUsingTagName(inputHTMLTags, tagName);
				break;
			default:
					System.out.println("Invalid Option at Switch");
		}
	}

	public static void findchildUsingLineNumber(String inputHTMLTags, int lineNumber) {

		ArrayList<String> child = new ArrayList<String>();

		int StrLen = inputHTMLTags.split("\n").length;
        if(lineNumber > StrLen) 
        {
       	 System.out.println("File contains only "+StrLen+" Lines");
        }
        else 
        {
		   for(int i=lineNumber ; i<=StrLen; i++) 
		   {
	        String OpenTag = inputHTMLTags.split("\n")[lineNumber-1];
	        String CloseTag = OpenTag.charAt(0)+"/"+OpenTag.substring(1,OpenTag.length());    
		        if(OpenTag.contains("</") || OpenTag.contains("/>")) 
		        {
		        	System.out.println("Its a Closing Tag");
		        	break;
		        }
		        else 
		        {
		        	for (int j = i; j < StrLen-1; j++) 
		        	{
		        		if(CloseTag.equals(inputHTMLTags.split("\n")[j])) 
		        		{
		        		   	break;
		        		}
		        		else 
		        		{
		        			String str=inputHTMLTags.split("\n")[j];
		        			str = str.contains("<")?str.replace("<", ""):str;
		        			str = str.contains(">")?str.replace(">", ""):str;
		        			str = str.contains("/")?str.replace("/", ""):str;
		        			child.add(str);
		        		}
		        	}
		        	break;
		        }
		   }

		System.out.println("Output: "+child);
        }
	}

	public static void findchildUsingTagName(String inputHTMLTags, String tagName) {

		ArrayList<String> child = new ArrayList<String>();

		int StrLen = inputHTMLTags.split("\n").length;
		for(int lineNumber=0 ; lineNumber < StrLen-1 ; lineNumber++) 
		{
			String strTag=inputHTMLTags.split("\n")[lineNumber];
			
			strTag = strTag.contains("<")?strTag.replace("<", ""):strTag;
			strTag = strTag.contains(">")?strTag.replace(">", ""):strTag;
			strTag = strTag.contains("/")?strTag.replace("/", ""):strTag;
			child.add(strTag);
			if(tagName.equals(strTag.substring(0,(strTag.length()-1)))) 
			{
				findchildUsingLineNumber(inputHTMLTags, lineNumber+1);
				break;
			}
		}
	}

}






















