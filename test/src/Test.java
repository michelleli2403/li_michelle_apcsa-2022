import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		int[][] ticketInfo = { {25,20,25}, {25,20,25}, {25,2,2,2} };
		String[][] seatingInfo = { {"Jamal", "Maria"}, {"Jake", "Suzy"}, {"Emma", "Luke"} };
		System.out.println(Arrays.toString(seatingInfo[1]));
	}
}