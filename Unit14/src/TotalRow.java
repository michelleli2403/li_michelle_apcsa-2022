//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{

    public static List<Integer> getRowTotals( int[][] m )
    {
    	//add code here
    	List<Integer> list = new ArrayList<Integer>();
    	int sum=0;
    	for (int[] row : m) {
    		for (int num : row) {
    			sum+=num;
    			list.add(sum);
    		}
    	}
		return list;
    }
}
