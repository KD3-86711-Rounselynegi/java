package com.app.geometry;

import java.util.Scanner;

public class Point2D {
      private int xaxis;
      private int yaxis;
	
      Scanner sc = new Scanner(System.in);
      
      public Point2D(int xaxis, int yaxis) {
		this.xaxis = xaxis;
		this.yaxis = yaxis;
	}

	public int getXaxis() {
		return xaxis;
	}

	public void setXaxis(int xaxis) {
		this.xaxis = xaxis;
	}

	public int getYaxis() {
		return yaxis;
	}

	public void setYaxis(int yaxis) {
		this.yaxis = yaxis;
	}
      
	public String getDetails()
	{
		return ("(" + xaxis + "," + yaxis + ")");
	}
	
	public boolean isEqual(Point2D p2)//this-> p1
	{
		if(this.xaxis == p2.xaxis && this.yaxis == p2.yaxis)
		{
			return true;
		}
		else
		{
			calculateDistance(p2);
			return false;
		}
		
	}
	public double calculateDistance(Point2D p2)// this->p1
	{
		return Math.sqrt(Math.pow((this.xaxis-p2.xaxis),2) + (Math.pow((this.yaxis-p2.yaxis),2)));
	}
	public void accept()
	{
		System.out.println("Enter the x-axis:");
		xaxis = sc.nextInt();
		System.out.println("Enter the y-axis:");
		yaxis = sc.nextInt();
	}
	
	
}

