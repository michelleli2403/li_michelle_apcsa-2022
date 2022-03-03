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
		setRational(1,1);
	}
	
	public Rational(int one, int two) {
		setRational(one,two);
	}

	//write a setRational method
	public void setRational(int one, int two) {
		setNum(one);
		setDen(two);
	}
	

	//write  a set method for numerator and denominator
	public void setNum(int num) {
		a=num;
	}
	
	public void setDen(int den) {
		b=den;
	}

	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		setNum(a*other.getDen() + other.getNum() * b);
		setDen(b*other.getDen());


		reduce();
	}

	private void reduce()
	{
		int gcd = gcd(a,b);
		setNum(a/gcd);
		setDen(b/gcd);
	}

	private int gcd(int numOne, int numTwo)
	{
		int temp=1;
		for (int i=1; i<=numOne; i++) {
			if(numOne%i==0 && numTwo%i==0) {
				temp=i;
			}
		}

		return temp;
	}

	public Object clone ()
	{
		return new Rational(a,b);
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	public int getNum() {
		return a;
	}
	
	public int getDen() {
		return b;
	}
	
	
	public boolean equals( Object obj)
	{
		((Rational) obj).reduce();
		if (a*getDen()-((Rational)obj).getNum()*b==0) {
			return true;
		}

		return false;
	}

	public int compareTo(Rational other)
	{
		other.reduce();
		int temp = a*other.getDen()-other.getNum()*b;
		if(temp>0) {
			return 1;
		}
		else if (temp<0) {
			return -1;
		}
		else {
			return 0;
		}

	}

	
	//write  toString() method
	public String toString() {
		return a + "/" + b;
	}
	
	
}