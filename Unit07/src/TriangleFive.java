//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter(' ');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter=c;
	}

	public void setAmount(int amt)
	{
		amount=amt;
	}
	
	public String makeTri() {
		String output="";
		char changeLetter = letter;
		int increase=0;
		for (int k=amount; k>=1; k--) {
			for (int i=k; i>=1; i--) {
				for (int j=1; j<=i+increase; j++) {
					output+=changeLetter;
				}
				if (changeLetter=='Z') {
					changeLetter='A'-1;
				}
				changeLetter++;
				output+=" ";
				
			}
			increase++;
			output+="\n";
			changeLetter=letter;
		}
		return output;
		
	}

	public String toString()
	{
		return makeTri();
	}
}