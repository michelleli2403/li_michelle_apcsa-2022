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

	public String toString()
	{
		String output="";
		int index = 0;
		for (int k=amount; k>=1; k--) {
			for (int i=amount; i>=1; i--) {
				for (int j=1; j<=i; j++) {
					output+=letter;
				}
				letter++;
				output+=" ";
			}
			index = output.charAt(k);
			output+="\n";
			System.out.println(output.lastIndexOf(' '));
			/*while (index!=' ') {
				output+=letter;
			}*/
			
		}

		return output;
	}
}