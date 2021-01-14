package com.jspiders.clocks;
/*calculate the angle covered by hour hand and min hand if time is 7:20
 */
public class Program1 
{
	public static void main(String[] args)
	{
		double hour=7;
		double min=20;
		double angle1 =hour*30+min*0.5;
		double angle2 =6*min;
		System.out.println("Hour hand:"+angle1);
		System.out.println("Min hand:"+angle2);
	}

}
