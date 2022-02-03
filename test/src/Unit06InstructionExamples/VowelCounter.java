package Unit06InstructionExamples;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class VowelCounter {
	
	public static String getNumberString(String s) {
		String vowel = "aeiouAEIOU";
		int index = -1;
		if (s.length()==0) { 
			return ""; 
		} 
		char c = s.charAt(0);
		for (int i = 0; i < s.length(); i++) {
			if (index == 9) {
				index = -1;
			}
			c = s.charAt(i);
			if (vowel.indexOf(c) != -1) {
				index++;
				s = s.substring(0, i) + index + s.substring(i + 1);
			}
		}
		return s;
	}
}