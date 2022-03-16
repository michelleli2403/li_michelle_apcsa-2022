public class Test {
<<<<<<< Updated upstream
	
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
=======
	public static void main(String[] args) {
		int[][] mat = {{5,7},{5,3,4,6},{0,8,9}};

		for( int[] row : mat )
		{
		   for( int num : row )
		   {
		      System.out.print( num + " ");
		   }
		   System.out.println();
		}

}
>>>>>>> Stashed changes
}
	