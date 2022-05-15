import java.util.Arrays;

public class TestRunner
{
	public static void main(String[] args) {
		int[][] a = {{0,1,2},{3,4,5}};
		int[][] b = new int[2][3];
		b=a;
		System.out.println(Arrays.deepToString(b));
	}
}

