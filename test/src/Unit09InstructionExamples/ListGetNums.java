package Unit09InstructionExamples;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListGetNums
{
	//method go will return an array
	//containing the first 3 numbers
	//greater than 11
	public static List<Integer> go( List<Integer> ray )
	{
		int count=0;
		List<Integer> newRay = new ArrayList<>();
		for (int i=0; i<ray.size(); i++) {
			if (ray.get(i)>11) {
				count++;
				newRay.add(ray.get(i));
			}
			if (count==3) {
				return newRay;
			}
		}
		return newRay;
	}
}