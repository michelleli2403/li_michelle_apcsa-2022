public class Dot implements Locatable
{
   private int xPos, yPos, size;

   public Dot(){
      xPos=yPos=size=0;
   }

   public Dot(int x, int y){
      xPos=x;
      yPos=y;
      //size=0;
   }

   public Dot(int x, int y, int spd){
      xPos=x;
      yPos=y;
      size=spd;
   }

   public int getXPos(){
      return xPos;
   }

   public int getYPos(){
      return yPos;
   }

   public String toString()
   {
      return "" + xPos + " " + yPos + " " + size;
   }  
   

}

