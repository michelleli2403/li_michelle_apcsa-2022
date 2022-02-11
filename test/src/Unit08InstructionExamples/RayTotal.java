package Unit08InstructionExamples;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

/*public class RayTotal
{
	public static int go(int[] ray)
	{
		int sum=0;
		for (int i=0; i<ray.length; i++) {
			sum+=ray[i];
		}
		return sum;
	}
}*/

public class RayTotal {
	private int[] ray;
	
	public RayTotal() {
		setRay(new int[] {0});
	}
	
	public RayTotal(int[] x) {
		setRay(x);
	}
	
	public void setRay(int[] x) {
		ray=x;
	}
	
	public int go(int[] x) {
		int sum=0;
		for (int i=0; i<x.length; i++) {
			sum+=x[i];
		}
		return sum;
	}
	
	public String toString() {
		return ""+go(ray);
	}
}