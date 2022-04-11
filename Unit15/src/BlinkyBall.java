//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class BlinkyBall extends Ball {
	private int xSpeed;
	private int ySpeed;

	// constructors
	public BlinkyBall() {
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	public BlinkyBall(int x, int y) {
		super(x, y);
		xSpeed = 3;
		ySpeed = 1;

	}

	public BlinkyBall(int x, int y, int wid, int ht) {
		super(x, y, wid, ht);
		xSpeed = 3;
		ySpeed = 1;
	}

	public BlinkyBall(int x, int y, int wid, int ht, int xSpd, int ySpd) {
		super(x, y, wid, ht, xSpd, ySpd);
		setXSpeed(xSpd);
		setYSpeed(ySpd);

	}

	public BlinkyBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {
		super(x, y, wid, ht, col, xSpd, ySpd);
		setXSpeed(xSpd);
		setYSpeed(ySpd);

	}
	
	public void setXSpeed(int xSpd) {
		xSpeed=xSpd;
	}
	
	public void setYSpeed(int ySpd) {
		ySpeed=ySpd;
	}
	
	public int getXSpeed(int xSpd) {
		return xSpeed;
	}
	
	public int getYSpeed(int ySpd) {
		return ySpeed;
	}
	

	public Color randomColor() {
		int r = (int) (Math.random() * 256); // use Math.random()
		int g = (int) (Math.random() * 256);
		int b = (int) (Math.random() * 256);
		return new Color(r, g, b);
	}

	
	public void moveAndDraw(Graphics window) {
		// draw a random color ball at old ball location
		draw(window, Color.white);

		setX(getX() + xSpeed);

		// setY
		setY(getY() + ySpeed);

		// draw the ball at its new location
		draw(window,randomColor());

	}
}