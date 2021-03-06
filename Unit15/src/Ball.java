//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	public Ball(int x, int y) {
		super(x,y);
		xSpeed=3;
		ySpeed=1;
	}
	
	public Ball(int x, int y, int wid, int ht) {
		super(x,y,wid,ht);
		xSpeed=3;
		ySpeed=1;
	}
	
	public Ball(int x, int y, int wid, int ht, Color c) {
		super(x,y,wid,ht,c);
	}
	
	public Ball(int x, int y, int wid, int ht, int xSpeed, int ySpeed) {
		super(x,y,wid,ht);
		setXSpeed(xSpeed);
		setYSpeed(ySpeed);
	}
	
	public Ball(int x, int y, int wid, int ht, Color c, int xSpeed, int ySpeed) {
		super(x,y,wid,ht,c);
		setXSpeed(xSpeed);
		setYSpeed(ySpeed);
	}
	
	   
   //add the set methods
	
	public void setXSpeed(int xSpd) {
		xSpeed=xSpd;
	}
	
	public void setYSpeed(int ySpd) {
		ySpeed=ySpd;
	}
   
	

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	  draw(window,Color.white);

      setX(getX()+xSpeed);
      
		//setY
      setY(getY()+ySpeed);
      
		//draw the ball at its new location
      draw(window);
   }
   
	public boolean equals(Object obj)
	{
		Ball other = (Ball)obj;
		if(super.equals(other)&&getXSpeed()==other.getXSpeed()&&getYSpeed()==other.getYSpeed())
			return true;
		return false;

	}   

   //add the get methods
	
	public int getXSpeed() {
		return xSpeed;
	}
	
	public int getYSpeed() {
		return ySpeed;
	}
	

   //add a toString() method
	public String toString() {
		return getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + xSpeed + " " + ySpeed;
	}

	
	

	
}