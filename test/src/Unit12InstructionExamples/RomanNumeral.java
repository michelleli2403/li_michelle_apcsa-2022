package Unit12InstructionExamples;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class RomanNumeral implements Comparable<RomanNumeral>
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		setRoman(str);
	}

	public RomanNumeral(Integer orig)
	{
		setNumber(orig);
	}

	//write a set number method
	public void setNumber(int num) {
		number=num;
	}
	
	//write a set roman method
	public void setRoman(String rom) {
		roman=rom;
	}

	//write get methods for number and roman
	public int getNumber() {
		return number;
	}
	public String getRoman() {
		return roman;
		
	}
	

	public int compareTo(RomanNumeral r) //roman numeral to int
	{
		int sum1=0;
		int sum2=0;
		String newRoman=roman;
		String newRoman2=r.getRoman();

		for (int j=0; j<LETTERS.length; j++) {
			if (newRoman.indexOf(LETTERS[j])!=-1) {
				sum1+=NUMBERS[j];
				newRoman=newRoman.substring(LETTERS[j].length());
			}
		}
		
		for (int i=0; i<LETTERS.length; i++) {
			if (newRoman2.indexOf(LETTERS[i])!=-1) {
				sum2+=NUMBERS[i];
				newRoman2=newRoman2.substring(LETTERS[i].length());
			}
		}
		
		return sum1-sum2;
		
	}

	//write  toString() method
	public String toString() {
		String roman1="";
		int remain=getNumber();
		for (int i=0; i<NUMBERS.length; i++) {
			int j=0;
			if (NUMBERS[j]<=remain) {
				roman1+=LETTERS[i];
				remain=remain-NUMBERS[i];
				System.out.println("afdsf"+remain);
				j++;
			}
		}
		return roman1;
	}
	
	
}