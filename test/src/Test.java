public class Test {
	
	public static String scrambleWord(String word) {
		int current=0;
		String result="";
		while (current<word.length()-1) {
			if (word.charAt(current)=='A' && !word.substring(current+1,current+2).equals("A")) {
				result+=word.substring(current+1,current+2);
				result+="A";
				current+=2;
			}
			else {
				result+=word.substring(current,current+1);
				current++;
			}
		}
		if(current<word.length()) {
			result+=word.substring(current);
		}
		return result;
	}
	
	public static void main(String[] args) {
		//System.out.println("fdfd");
		System.out.println(Test.scrambleWord("AARDVARK"));
	}
}
	