//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class MatrixCount1Runner
{
	public static void main( String args[] ) throws Exception
	{
		//add code
		System.out.println("Matrix values");
		for (int[] row : MatrixCount1.getM()) {
			for (int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("The 7 count is :: " + MatrixCount1.count(7));
		System.out.println("The 8 count is :: " + MatrixCount1.count(8));
		System.out.println("The 6 count is :: " + MatrixCount1.count(6));
		System.out.println("The 21 count is :: " + MatrixCount1.count(21));
	}
}



