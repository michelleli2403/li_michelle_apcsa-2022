//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int index=-1;
		int index2=-1;
		int difference=0;
		for (int i=0; i<ray.size(); i++) {
			if (ray.get(i)%2==1) {
				index=i;
				break;
			}
		}
		for (int j=ray.size()-1; j>index; j--) {
			if (ray.get(j)%2==0) {
				index2=j;
				break;
			}
		}
		difference = index2-index;
		if (index2==-1 || index==-1) {
			return -1;
		}
		return difference;
	}
}