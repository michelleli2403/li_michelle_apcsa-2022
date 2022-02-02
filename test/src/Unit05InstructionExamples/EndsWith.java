package Unit05InstructionExamples;
import static java.lang.System.*;

public class EndsWith {
	private static String lastPart, word;
	private static int partLength;
	
	public EndsWith() {
		lastPart = " ";
		partLength = 0;
	}
	
	public EndsWith(String a, String b) {
		endsWith(a,b);
	}
	
	public static boolean endsWith(String a, String b) {
		word = a;
		lastPart = b;
		partLength = lastPart.length();
		String lastWord = a.substring(a.length()-partLength);
		if (lastWord.indexOf(lastPart)!=-1) {
			return true;
		}
		else {
			return false;
		}
	}
}