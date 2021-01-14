package com.jspiders.Test;
class BintoDeci {
	public static void main(String[] args)
	{
		int dec=20;
		String s=" ";
		while(dec>0)
		{
			int t=dec%2;
			s=t+s;
			dec=dec/2;
		}
		System.out.println(s);
	}	
}
