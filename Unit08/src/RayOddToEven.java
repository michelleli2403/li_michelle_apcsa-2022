//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int firstOdd=0;
		int nextEven=0;
		int firstEven=0;
		int distance=0;
		int oddCount=0;
		int evenCount=0;
		for (int i=0; i<ray.length; i++) {
			if (ray[i]%2==1) {
				firstOdd=i;
				oddCount++;
				break;
			}
		}
		for (int i=firstOdd; i<ray.length; i++) {
			if (ray[i]%2==0) {
				nextEven=i;
				evenCount++;
				break;
			}
		}
		for (int i=0; i<ray.length; i++) {
			if (ray[i]%2==0) {
				firstEven=i;
				break;
			}
		}
		if (evenCount==0 || oddCount==0) {
			return -1;
		}
		distance = Math.abs(firstEven-firstOdd);
		return distance;
	}
}