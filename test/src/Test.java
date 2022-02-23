import java.util.Scanner;

public class Test
{
	public static void main(String[] args) {
		String nums = "1 2 3 4 5 6 7";
		Scanner chopAh = new Scanner(nums);
		while(chopAh.hasNextDouble())
		{ 
		   System.out.println(chopAh.nextDouble()%2);
		}

	}
		
}

