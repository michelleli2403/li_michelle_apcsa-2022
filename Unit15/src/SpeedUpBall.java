//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball
{

   //instance variables
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private int xSpeed;
	private int ySpeed;

   public SpeedUpBall()
   {
	   super();

   }

   public SpeedUpBall(int x, int y)
   {
	   super(x,y);

   }


   public SpeedUpBall(int x, int y, int xSpd, int ySpd)
   {
	   super(x,y,xSpd,ySpd);

   }

   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x,y,wid,ht,xSpd,ySpd);

   }


   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   super(x,y,wid,ht,col,xSpd,ySpd);



   }

   public void setXSpeed( int xSpd )
   {
	   xSpeed=xSpd;



   }

   public void setYSpeed( int ySpd )
   {

	   ySpeed=ySpd;


   }
   
   
   
   public void increaseSpeed(int spd) {
	   ball = new Ball(10,100,10,10,Color.blue,2,1);
	   leftPaddle = new Paddle(20,200,10,40,Color.orange,2);
	   rightPaddle = new Paddle(760,200,10,40,Color.orange,2);
	   if(ball.getX()<=leftPaddle.getX()+leftPaddle.getWidth() && ((leftPaddle.getY()<=ball.getY()) && (ball.getY()<=leftPaddle.getY()+leftPaddle.getHeight()))) {        
			xSpeed++;
			ySpeed++;
		}
		
		
		//see if the ball hits the right paddle
		if(ball.getX()>=rightPaddle.getX()-rightPaddle.getWidth() && ((rightPaddle.getY()<=ball.getY()) && (ball.getY()<=rightPaddle.getY()+rightPaddle.getHeight()))) {
			xSpeed++;
			ySpeed++;
		}
   }
   
   public int getXSpeed( int xSpd )
   {
	   return xSpeed;
   }

   public int getYSpeed( int ySpd )
   {

	   return ySpeed;


   }
}

