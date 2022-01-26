//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Rect
{
	private int length;
	private int width;
	public Rect(int rectLength, int rectWidth) {
		length = rectLength;
		width = rectWidth;
	}
	public double perimeter()
	{
		return 2*length+2*width;
	}
}