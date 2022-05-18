/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    //Picture beach = new Picture("C:/Users/lim2403/Desktop/apcsa/li_michelle_apcsa-2022/li_michelle_apcsa-2022/Unit16/src/images/beach.jpg");
	  Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("src/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("src/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("src/images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("src/images/swan.jpg");
    swan.explore();
    swan.edgeDetection(10);
    swan.explore();
  }
  
  //method to test keepOnlyBlue
  public static void testKeepOnlyBlue() {
	  Picture gorge = new Picture("src/images/gorge.jpg");
	  gorge.explore();
	  gorge.keepOnlyBlue();
	  gorge.explore();
  }
  
  public static void testNegate() {
	  Picture snowman = new Picture("src/images/snowman.jpg");
	  snowman.explore();
	  snowman.negate();
	  snowman.explore();
  }
  
  public static void testGrayscale() {
	  Picture arch = new Picture("src/images/arch.jpg");
	  arch.explore();
	  arch.grayscale();
	  arch.explore();
  }
  
  public static void testFixUnderwater() {
	  Picture water = new Picture("src/images/water.jpg");
	  water.explore();
	  water.fixUnderWater();
	  water.explore();
  }
  
  public static void testMirrorVerticalRightToLeft() {
	  Picture motor = new Picture("src/images/redMotorcycle.jpg");
	  motor.explore();
	  motor.mirrorVerticalRightToLeft();
	  motor.explore();
  }
  
  public static void testMirrorHorizontal() {
	  Picture motor = new Picture("src/images/redMotorcycle.jpg");
	  motor.explore();
	  motor.mirrorHorizontal();
	  motor.explore();
  }
  
  public static void testMirrorHorizontalBotToTop() {
	  Picture motor = new Picture("src/images/redMotorcycle.jpg");
	  motor.explore();
	  motor.mirrorHorizontalBotToTop();
	  motor.explore();
  }
  
  public static void testMirrorDiagonal() {
	  Picture beach = new Picture("src/images/beach.jpg");
	  beach.explore();
	  beach.mirrorDiagonal();
	  beach.explore();
  }
  
  public static void testMirrorArms() {
	  Picture snowman = new Picture("src/images/snowman.jpg");
	  snowman.explore();
	  snowman.mirrorArms();
	  snowman.explore();
  }
  
  public static void testMirrorGull() {
	  Picture gull = new Picture("src/images/seagull.jpg");
	  gull.explore();
	  gull.mirrorGull();
	  gull.explore();
  }
  
  public static void testCopy() {
	  Picture gull = new Picture("src/images/seagull.jpg");
	  gull.explore();
	  //gull.copy(gull,10,50);
	  gull.copy(gull,70,70,120,120,20,20);
	  gull.explore();

  }
  
  public static void testMyCollage()
  {
    Picture canvas = new Picture("src/images/640x480.jpg");
    canvas.explore();
    canvas.myCollage();
    canvas.explore();
  }
  
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("src/images/swan.jpg");
    swan.explore();
    swan.edgeDetection2(10);
    swan.explore();
  }
  
  public static void testBackgroundSwap()
  {
	  Picture mark = new Picture("src/images/blue-mark.jpg");
	  Picture moon = new Picture("src/images/moon-surface.jpg");
	  mark.explore();
	  mark.backgroundSwap(moon); //replace blue pixels in mark with pixels in moon
	  //replace pixels containing the logo on the t-shirt
	
	  mark.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	  
	//testKeepOnlyBlue();
	//testNegate();
	//testGrayscale();
	  //testFixUnderwater();
	  //testMirrorVerticalRightToLeft();
	  //testMirrorHorizontal();
	  //testMirrorHorizontalBotToTop();
	  //testMirrorDiagonal();
	  //testMirrorArms();
	  //testMirrorGull();
	  //testMyCollage();
	  testBackgroundSwap();
  }
}