package Unit07InstructionExamples;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

class PasswordCheck
{
	private String password;

	public PasswordCheck()
	{
		password="hello";
	}

	public void check()
	{
		String guess="";
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.print("Enter the password :: ");
			guess=keyboard.next();
			
			if (guess.equals(password)) {
				System.out.println("VALID");
			}
			
			else {
				System.out.println("INVALID");
			}
		}while (!(guess.equals(password)));
		
	}
}