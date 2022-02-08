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
		//String changeOutput = output;
		String smaller = output;
		for (int k=amount; k>=1; k--) {
			for (int i=amount; i>=1; i--) {
				for (int j=1; j<=i; j++) {
					output+=changeLetter;
				}
				changeLetter++;
				output+=" ";
				
			}
			output+="\n";
			changeLetter=letter;
			//System.out.println(k);
			smaller=output.substring(0,k*3-1);
			System.out.println(smaller);
			//changeOutput=output;
			//output=output.substring(0,output.length()-1);
			//System.out.println(output.lastIndexOf(' '));
			
		}
		//output=output.substring(0,9);

		return output;
		
	}

	public String toString()
	{
		return makeTri();
	}
}