package com.jspiders.passingObjects;
class Player
{
	String playerName;
	int jerseyNumber;
}
class Auction
{
	static Player purchasePlayer()
	{
		Player p=new Player();
		p.jerseyNumber=7;
		p.playerName="Dhoni";
		return p;
	}
}

public class Program4 
{
	public static void main(String[] args)
	{
		Player p1=Auction.purchasePlayer();
		System.out.println(p1.playerName);
		System.out.println(p1.jerseyNumber);
	}
}
