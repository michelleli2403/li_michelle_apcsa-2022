//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples {
	private int number;
	private int a;
	private int b;
	private int c;
	public Triples() {
		this(0);
	}
	
	public Triples(int num) {
		setNum(num);
	}
	
	public void setNum(int num) {
		number=num;
	}
	
	public String findTriple() {
		String total="";
		for (int i=1; i<=number; i++) {
			for (int j=i+1; j<=number; j++) {
				for (int k=j+1; k<=number; k++) {
					if ((i*i)+(j*j)==(k*k)) {
						a=i;
						b=j;
						c=k;
						if (greatestCommonFactor()==1) {
							total+=a + " " + b + " " + c + "\n";
						}
					}
				}
			}
		}
		return total;
	}
	
	public int greatestCommonFactor() {
		int gcf=0;
		for (int i=1; i<=number; i++) {
			if (a%i==0 && b%i==0 && c%i==0) {
				gcf++;
			}
		}
		return gcf;
	}
	
	public String toString() {
		return findTriple();
	}
}