package Unit12InstructionExamples;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor
	public Monster() {
		setHeight(0);
		setWeight(0);
		setAge(0);
	}

	//write an initialization constructor with an int parameter ht
	public Monster(int ht) {
		setHeight(ht);
	}

	//write an initialization constructor with int parameters ht and wt
	public Monster(int ht, int wt) {
		setHeight(ht);
		setWeight(wt);
	}

	//write an initialization constructor with int parameters ht, wt, and age
	public Monster(int ht, int wt, int age) {
		setHeight(ht);
		setWeight(wt);
		setAge(age);
	}

	//modifiers - write set methods for height, weight, and age
	public void setHeight(int ht) {
		myHeight=ht;
	}
	public void setWeight(int wt) {
		myWeight=wt;
	}
	public void setAge(int age) {
		myAge=age;
	}
	
	//accessors - write get methods for height, weight, and age
	public int getHeight() {
		return myHeight;
	}
	public int getWeight() {
		return myWeight;
	}
	public int getAge() {
		return myAge;
	}
	
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster();
	}

	public boolean equals( Object obj )
	{
		if (getWeight()==((Monster) obj).getWeight() && getHeight()==((Monster) obj).getHeight() && getAge()==((Monster) obj).getAge()) {
			return true;
		}

		return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		if(getWeight()>rhs.getWeight())
			return 1;
		if (getHeight() > rhs.getHeight()) {
			return 1;
		}
		if (getAge() > rhs.getAge()) {
			return 1;
		}
		if (getWeight()==rhs.getWeight() && getHeight()==rhs.getHeight() && getAge()==rhs.getAge())
			return 0;

		return -1;
	}

	//write a toString() method
	public String toString() {
		return ""+getHeight() + " " + getWeight() + " " + getAge();
	}
	
	
}