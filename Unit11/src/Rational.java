//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int a;
	private int b;

	//write two constructors
	public Rational() {
		a=0;
		b=0;
	}
	
	public Rational(int one, int two) {
		a=one;
		b=two;
	}

	//write a setRational method
	public void setRational(int one, int two) {
		String fraction = "";
	}
	

	//write  a set method for numerator and denominator

	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		


		reduce();
	}

	private void reduce()
	{



	}

	private int gcd(int numOne, int numTwo)
	{


		return 1;
	}

	public Object clone ()
	{
		return "";
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	
	public boolean equals( Object obj)
	{


		return false;
	}

	public int compareTo(Rational other)
	{


		return -1;
	}



	
	//write  toString() method
	
	
}