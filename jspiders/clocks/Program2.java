package com.jspiders.clocks;
/*calculate the angle between hour hand and min hand if time is 7:20
 */
public class Program2
{
	public static void main(String[] args)
	{
		double hour=9;
		double min=10;
		double angle1 =hour*30+min*0.5;
		double angle2 =6*min;
		double anglebtwthem=angle1-angle2;
		System.out.println("Hour hand:"+angle1);
		System.out.println("Min hand:"+angle2);
		System.out.println("angle between Min hand and hour hand:"+anglebtwthem);
	}
}
