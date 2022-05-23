import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture. This class inherits from SimplePicture and
 * allows the student to add functionality to the Picture class.
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
	///////////////////// constructors //////////////////////////////////

	/**
	 * Constructor that takes no arguments
	 */
	public Picture() {
		/*
		 * not needed but use it to show students the implicit call to super() child
		 * constructors always call a parent constructor
		 */
		super();
	}

	/**
	 * Constructor that takes a file name and creates the picture
	 * 
	 * @param fileName the name of the file to create the picture from
	 */
	public Picture(String fileName) {
		// let the parent class handle this fileName
		super(fileName);
	}

	/**
	 * Constructor that takes the width and height
	 * 
	 * @param height the height of the desired picture
	 * @param width  the width of the desired picture
	 */
	public Picture(int height, int width) {
		// let the parent class handle this width and height
		super(width, height);
	}

	/**
	 * Constructor that takes a picture and creates a copy of that picture
	 * 
	 * @param copyPicture the picture to copy
	 */
	public Picture(Picture copyPicture) {
		// let the parent class do the copy
		super(copyPicture);
	}

	/**
	 * Constructor that takes a buffered image
	 * 
	 * @param image the buffered image to use
	 */
	public Picture(BufferedImage image) {
		super(image);
	}

	////////////////////// methods ///////////////////////////////////////

	/**
	 * Method to return a string with information about this picture.
	 * 
	 * @return a string with information about the picture such as fileName, height
	 *         and width.
	 */
	public String toString() {
		String output = "Picture, filename " + getFileName() + " height " + getHeight() + " width " + getWidth();
		return output;

	}

	/** Method to set the blue to 0 */
	public void zeroBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setBlue(0);
			}
		}
	}

	/**
	 * Method that mirrors the picture around a vertical mirror in the center of the
	 * picture from left to right
	 */
	public void mirrorVertical() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	/** Mirror just part of a picture of a temple */
	public void mirrorTemple() {
		int mirrorPoint = 276;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 27; row < 97; row++) {
			// loop from 13 to just before the mirror point
			for (int col = 13; col < mirrorPoint; col++) {

				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
				count++;
			}
		}
		System.out.println(count);
	}

	/**
	 * copy from the passed fromPic to the specified startRow and startCol in the
	 * current picture
	 * 
	 * @param fromPic  the picture to copy from
	 * @param startRow the start row to copy to
	 * @param startCol the start col to copy to
	 */
	public void copy(Picture fromPic, int startRow, int startCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length
				&& toRow < toPixels.length; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length
					&& toCol < toPixels[0].length; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}

	/** Method to create a collage of several pictures */
	public void createCollage() {
		Picture flower1 = new Picture("src/images/flower1.jpg");
		Picture flower2 = new Picture("src/images/flower2.jpg");
		this.copy(flower1, 0, 0);
		this.copy(flower2, 100, 0);
		this.copy(flower1, 200, 0);
		Picture flowerNoBlue = new Picture(flower2);
		flowerNoBlue.zeroBlue();
		this.copy(flowerNoBlue, 300, 0);
		this.copy(flower1, 400, 0);
		this.copy(flower2, 500, 0);
		this.mirrorVertical();
		this.write("src/images/collage.jpg");
	}

	/**
	 * Method to show large changes in color
	 * 
	 * @param edgeDist the distance for finding edges
	 */
	public void edgeDetection(int edgeDist) {
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color rightColor = null;
		Color bottomColor = null;
		int[][] arr = new int[pixels.length][pixels[0].length];
		for (int row = 0; row < pixels.length - 1; row++) {
			for (int col = 0; col < pixels[0].length - 1; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][col + 1];
				rightColor = rightPixel.getColor();
				if (leftPixel.colorDistance(rightColor) > edgeDist)
					// leftPixel.setColor(Color.BLACK);
					arr[row][col] = 1;
				else
					// leftPixel.setColor(Color.WHITE);
					arr[row][col] = 0;

				/*
				 * topPixel=pixels[row][col]; bottomPixel=pixels[row+1][col]; bottomColor =
				 * bottomPixel.getColor(); if (topPixel.colorDistance(bottomColor)>edgeDist)
				 * topPixel.setColor(Color.BLACK); else topPixel.setColor(Color.WHITE);
				 */
			}
		}
		for (int col = 0; col < pixels[0].length; col++) {
			for (int row = 0; row < pixels.length - 1; row++) {
				topPixel = pixels[row][col];
				bottomPixel = pixels[row + 1][col];
				bottomColor = bottomPixel.getColor();
				if (topPixel.colorDistance(bottomColor) > edgeDist)
					// topPixel.setColor(Color.BLACK);
					arr[row][col] = 1;
				else
					// topPixel.setColor(Color.WHITE);
					arr[row][col] = 0;
			}
		}

		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < pixels[0].length; col++) {
				if (arr[row][col] == 1)
					pixels[row][col].setColor(Color.BLACK);
				else
					pixels[row][col].setColor(Color.WHITE);
			}
		}
	}

	public void edgeDetection2(int edgeDist) {
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color rightColor = null;
		Color bottomColor = null;
		int[][] arr = new int[pixels.length][pixels[0].length];
		for (int row = 0; row < pixels.length - 1; row++) {
			for (int col = 0; col < pixels[0].length - 1; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][col + 1];
				rightColor = rightPixel.getColor();
				if (leftPixel.colorDistance(rightColor) > edgeDist)
					// leftPixel.setColor(Color.BLACK);
					arr[row][col] = 1;
				else
					// leftPixel.setColor(Color.WHITE);
					arr[row][col] = 0;

				/*
				 * topPixel=pixels[row][col]; bottomPixel=pixels[row+1][col]; bottomColor =
				 * bottomPixel.getColor(); if (topPixel.colorDistance(bottomColor)>edgeDist)
				 * topPixel.setColor(Color.BLACK); else topPixel.setColor(Color.WHITE);
				 */
			}
		}
		for (int col = 0; col < pixels[0].length; col++) {
			for (int row = 0; row < pixels.length - 1; row++) {
				topPixel = pixels[row][col];
				bottomPixel = pixels[row + 1][col];
				bottomColor = bottomPixel.getColor();
				if (topPixel.colorDistance(bottomColor) > edgeDist)
					// topPixel.setColor(Color.BLACK);
					arr[row][col] = 1;
				else
					// topPixel.setColor(Color.WHITE);
					arr[row][col] = 0;
			}
		}

		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < pixels[0].length; col++) {
				if (arr[row][col] == 1)
					pixels[row][col].setColor(Color.BLACK);
				else
					pixels[row][col].setColor(Color.WHITE);
			}
		}
	}

	public void keepOnlyBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(0);
				pixelObj.setGreen(0);
			}
		}
	}

	public void negate() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(255 - pixelObj.getRed());
				pixelObj.setGreen(255 - pixelObj.getGreen());
				pixelObj.setBlue(255 - pixelObj.getBlue());
			}
		}
	}

	public void grayscale() {
		Pixel[][] pixels = this.getPixels2D();
		int avg = 0;
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				avg = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3;
				pixelObj.setRed(avg);
				pixelObj.setGreen(avg);
				pixelObj.setBlue(avg);
			}
		}
	}

	public void fixUnderWater() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(pixelObj.getRed() * 5);
				pixelObj.setGreen(pixelObj.getGreen() / 4);
				pixelObj.setBlue(pixelObj.getBlue() / 7);
			}
		}
	}

	public void mirrorVerticalRightToLeft() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				leftPixel.setColor(rightPixel.getColor());
			}
		}
	}

	public void mirrorHorizontal() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		int height = pixels.length;
		for (int col = 0; col < pixels[0].length; col++) {
			for (int row = 0; row < height / 2; row++) {
				topPixel = pixels[row][col];
				bottomPixel = pixels[height - 1 - row][col];
				bottomPixel.setColor(topPixel.getColor());
			}
		}
	}

	public void mirrorHorizontalBotToTop() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		int height = pixels.length;
		for (int col = 0; col < pixels[0].length; col++) {
			for (int row = 0; row < height / 2; row++) {
				topPixel = pixels[row][col];
				bottomPixel = pixels[height - 1 - row][col];
				topPixel.setColor(bottomPixel.getColor());
			}
		}
	}

	public void mirrorDiagonal() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < row; col++) {
				bottomPixel = pixels[row][col];
				topPixel = pixels[col][row];
				topPixel.setColor(bottomPixel.getColor());
			}
		}
	}

	/*
	 * Main method for testing - each class in Java can have a main method
	 */
	public static void main(String[] args) {
		// Picture beach = new
		// Picture("C:\\Users\\miche\\Desktop\\apcsa\\li_michelle_apcsa-2022\\Unit16\\src\\images\\beach.jpg\\");
		Picture beach = new Picture("src/images/beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
		beach.mirrorTemple();
	}

	public void mirrorArms() {
		// int mirrorPoint = 296;
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int col = 103; col < 296; col++) {
			int i = 0;
			for (int row = 162; row < 195; row++) {
				topPixel = pixels[row][col];
				bottomPixel = pixels[225 - i][col];
				bottomPixel.setColor(topPixel.getColor());
				i++;
			}
		}
	}

	public void mirrorGull() {
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();

		for (int row = 233; row < 322; row++) {
			int i = 0;
			for (int col = 237; col < 350; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][470 - i];
				rightPixel.setColor(leftPixel.getColor());
				i++;
			}
		}
	}

	public void copy(Picture fromPic, int startRow, int startCol, int endRow, int endCol, int row, int col) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = startRow, toRow = row; fromRow < endRow && toRow < toPixels.length; fromRow++, toRow++) {
			for (int fromCol = startCol, toCol = col; fromCol < endCol
					&& toCol < toPixels[0].length; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}

	public void myCollage() {
		Picture flower1 = new Picture("src/images/flower1.jpg");
		Picture flower2 = new Picture("src/images/flower2.jpg");
		Picture butterfly = new Picture("src/images/barbaraS.jpg");
		this.copy(flower1, 0, 0);
		this.copy(flower2, 0, 100);
		this.copy(butterfly, 100, 0);

		Picture flowerNoBlue = new Picture(flower2);
		flowerNoBlue.zeroBlue();
		this.copy(flowerNoBlue, 100, 100);

		Picture flowerKeepOnlyBlue = new Picture(flower1);
		flowerKeepOnlyBlue.keepOnlyBlue();
		this.copy(flowerKeepOnlyBlue, 250, 0);

		Picture butterflyGrayscale = new Picture(butterfly);
		butterflyGrayscale.grayscale();
		this.copy(butterflyGrayscale, 250, 100);

		this.mirrorVertical();
		this.write("src/images/collage.jpg");
	}

	public void backgroundSwap(Picture newBackground) {
		System.out.println("Michelle Li, Computer #17, 5/17/22");

		Pixel[][] pixels = this.getPixels2D();
		Pixel[][] moonPixels = newBackground.getPixels2D();

		for (int i = 0; i < pixels.length; i++) {
			for (int j = 0; j < pixels[0].length; j++) {
				if (pixels[i][j].getRed() < pixels[i][j].getBlue()
						&& pixels[i][j].getGreen() < pixels[i][j].getBlue()) {
					pixels[i][j].setColor(moonPixels[i][j].getColor());
				}
			}
		}

		for (int r = 364; r < 381; r++) {
			for (int c = 359; c < 403; c++) {
				pixels[r][c].setColor(pixels[358][340].getColor());
			}
		}

	}

	/**
	 * Hide a black and white message in the current picture by changing the red to
	 * even and then setting it to odd if the message pixel is black
	 * 
	 * @param messagePict the picture with a message
	 */
	public void encode(Picture messagePict) {
		Pixel[][] messagePixels = messagePict.getPixels2D();
		Pixel[][] currPixels = this.getPixels2D();
		Pixel currPixel = null;
		Pixel messagePixel = null;
		int count = 0;
		for (int row = 0; row < this.getHeight(); row++) {
			for (int col = 0; col < this.getWidth(); col++) {
				// if the current pixel red is odd make it even
				currPixel = currPixels[row][col];
				if (currPixel.getRed() % 2 == 1)
					currPixel.setRed(currPixel.getRed() - 1);
				messagePixel = messagePixels[row][col];
				if (messagePixel.colorDistance(Color.BLACK) < 50) {
					currPixel.setRed(currPixel.getRed() + 1);
					count++;
				}
			}
		}
		System.out.println(count);
	}

	/**
	 * Method to decode a message hidden in the red value of the current picture
	 * 
	 * @return the picture with the hidden message
	 */
	public Picture decode() {
		Pixel[][] pixels = this.getPixels2D();
		int height = this.getHeight();
		int width = this.getWidth();
		Pixel currPixel = null;

		Pixel messagePixel = null;
		Picture messagePicture = new Picture(height, width);
		Pixel[][] messagePixels = messagePicture.getPixels2D();
		int count = 0;
		for (int row = 0; row < this.getHeight(); row++) {
			for (int col = 0; col < this.getWidth(); col++) {
				currPixel = pixels[row][col];
				messagePixel = messagePixels[row][col];
				if (currPixel.getRed() % 2 == 1) {
					messagePixel.setColor(Color.BLACK);
					count++;
				}
			}
		}
		System.out.println(count);
		return messagePicture;
	}

} // this } is the end of class Picture, put all new methods before this
