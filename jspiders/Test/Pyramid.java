package com.jspiders.Test;
class Pyramid
{
    public static void main(String[] args)
    {
        int n = 5;
        int space=n-1;
        
        int str=1;
        for (int i=0; i<n; i++)
        {
          for(int j=0;j<space;j++)
          {
        	  System.out.print(" "+" ");
          }
          char ch='a';
          for(int k=0;k<str;k++)
          {
        	  System.out.print(ch +" ");
        	  if(k<str/2)
        		  ch++;
        	  else
        		  ch--;
          }
          space--;
          str=str+2;
          System.out.println();
        }
    }
}