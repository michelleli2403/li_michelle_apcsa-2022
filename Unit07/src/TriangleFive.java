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
		String changeOutput = output;
		int index = 0;
		int smaller = amount;
		for (int k=amount; k>=1; k--) {
			for (int i=amount; i>=1; i--) {
				for (int j=1; j<=i; j++) {
					changeOutput+=changeLetter;
				}
				changeLetter++;
				changeOutput+=" ";
			}
			//index = output.charAt(k);
			changeOutput+="\n";
			changeLetter=letter;
			output=changeOutput.substring(0,changeOutput.lastIndexOf(' '));
			//changeOutput=output;
			//output=output.substring(0,output.length()-1);
			//System.out.println(output.lastIndexOf(' '));
			
		}

		return output;
		
	}

	public String toString()
	{
		return makeTri();
	}
}