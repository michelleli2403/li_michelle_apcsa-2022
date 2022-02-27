import java.util.Arrays;

public class Test
{
	public static void changeOne(int[] ray)
	{
	   ray[0] = 0;
	   ray[1] = 1;
	}

	//test code
	public static void main(String[] args) {
		int[] nums = {5,4,3,2,1};
		System.out.println(Arrays.toString(nums));
		changeOne(nums); //pass address of nums (ref)
		System.out.println(Arrays.toString(nums));
	}
		
}

