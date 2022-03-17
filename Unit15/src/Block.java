//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		xPos=100;
		yPos=150;
		width=10;
		height=10;
		color=Color.black;

	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x,int y) {
		xPos=x;
		yPos=y;
		width=10;
		height=10;
		color=Color.black;
	}
	
	public Block(int x, int y) {
		xPos=x;
		yPos=y;
		width=10;
		height=10;
	}
	
	
	
	
	
	
	
	
	
	
	
	
   //add the other set methods
   

   public void setColor(Color col)
   {


   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      //window.setColor(color);
      //window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {


   }
   
	public boolean equals(Object obj)
	{




		return false;
	}   

   //add the other get methods
    

   //add a toString() method  - x , y , width, height, color
}