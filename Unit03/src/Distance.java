//(c) A+ Computer Science 
//www.apluscompsci.com

//Name - Michelle Li
//Date - 1/20/22
//Class - Period 1
//Lab  - Distance

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne=x1;
		yOne=y1;
		xTwo=x2;
		yTwo=y2;
	}

	public void calcDistance()
	{
		double xDiff;
		double yDiff;
		double xSquared;
		double ySquared;
		
		xDiff=xTwo-xOne;
		yDiff=yTwo-yOne;
		xSquared=Math.pow(xDiff, 2);
		ySquared=Math.pow(yDiff, 2);
		distance = Math.sqrt(xSquared+ySquared);
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public void print()
	{
		System.out.printf("distance == %.3f", distance);
	}
	
/*	//complete print or the toString

	public String toString()
	{
		return "";
	}*/
	
}
