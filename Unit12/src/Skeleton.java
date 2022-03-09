//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables
	String monsterName;
	int monsterSize;

	//add a constructor
	public Skeleton() {
		monsterName="";
		monsterSize=0;
	}
	public Skeleton(String name, int size) {
		monsterName=name;
		monsterSize=size;
	}

	//add code to implement the Monster interface
	public int getHowBig() {
		return monsterSize;
	}
	
	public String getName() {
		return monsterName;
	}
	
	public boolean isBigger(Monster other) {
		if (getHowBig() > other.getHowBig()) {
			return true;
		}
		return false;
	}
	
	public boolean isSmaller(Monster other) {
		if (getHowBig() < other.getHowBig())
			return true;
		return false;
	}
	
	public boolean namesTheSame(Monster other) {
		if (getName().equals(other.getName())) {
			return true;
		}
		return false;
	}
	
	public Object clone() {
		return new Skeleton();
	}
	
	public boolean equals(Object obj) {
		Monster monsterObj=(Monster)obj;
		if (getName().equals(monsterObj.getName()) && getHowBig()==monsterObj.getHowBig()) {
			return true;
		}
		return false;
	}

	//add a toString
	public String toString() {
		return getName() + " " + getHowBig();
	}
}







