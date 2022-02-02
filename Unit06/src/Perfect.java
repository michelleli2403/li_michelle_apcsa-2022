//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect() {
	   setNum(0);
   }
   
   public Perfect(int num) {
	   setNum(num);
   }

	//add a set method
   public void setNum(int num) {
	   number=num;
   }

	public boolean isPerfect()
	{
		int divisor=0;
		int sum=0;
		/*while (divisor<number-1) {
			divisor++;
			if (number%divisor==0) {
				sum+=divisor;
			}
		}*/
		do {
			divisor++;
			if (number%divisor==0) {
				sum+=divisor;
			}
		} while (divisor<number-1);
		if (sum==number) {
			return true;
		}
		return false;
	}

	//add a toString	
	public String toString() {
		if (isPerfect()) {
			return number + " is perfect.";
		}
		else {
			return number + " is not perfect.";
		}
	}
	
}