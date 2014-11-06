import java.awt.Color;
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
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      Picture beach2 = new Picture("beach.jpg");
      beach2.zeroBlue();
      beach2.explore();
   }
   /** Method to test colorSplash */
   public static void testColorSplash()
   {
      Picture smile = new Picture("/RiasPics/cheer85.jpg");
      Color c = new Color (253,83,50);
      smile.explore();  
      Picture smile2 = new Picture("/RiasPics/cheer85.jpg");
      smile2.colorSplash(c);
      smile2.explore();
   }
   /** Method to test zeroBlue
   **  Galanos
    */
   public static void testKeepOnlyBlue()
   {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      Picture beach2 = new Picture("beach.jpg");
      beach2.keepOnlyBlue();
      beach2.explore();
   }
   
    /** Method to test negate
   **  Galanos
    */
   public static void testNegate()
   {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      Picture beach2 = new Picture("beach.jpg");
      beach2.negate();
      beach2.explore();
   }
   
   /** Method to test grayScale
   **  Galanos
    */
   public static void testGrayscale()
   {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      Picture beach2 = new Picture("beach.jpg");
      beach2.grayscale();
      beach2.explore();
   }
   
   /** Method to test fixUnderwater
   **  Galanos
    */
   public static void testFixUnderwater()
   {
      Picture water = new Picture("water.jpg");
      water.explore();
      Picture water2 = new Picture("water.jpg");
      water2.fixUnderwater();
      water2.explore();
   }
   
   /** Method to test mirrorVertical */
   public static void testMirrorVertical()
   {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      Picture caterpillar2 = new Picture("caterpillar.jpg");
      caterpillar2.mirrorVertical();
      caterpillar2.explore();
   }
      /** Method to test mirrorVertical */
   public static void testMirrorVerticalRightToLeft()
   {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      Picture caterpillar2 = new Picture("caterpillar.jpg");
      caterpillar2.mirrorVerticalRightToLeft();
      caterpillar2.explore();
   }
   
      public static void testMirrorHorizontal()
   {
      Picture m = new Picture("rushi.jpg");
      m.explore();
      Picture m2 = new Picture("rushi.jpg");
      m2.mirrorHorizontal();
      m2.explore();
   }
        public static void testMirrorHorizontalBotToTop()
   {
      Picture m = new Picture("blueMotorcycle.jpg");
      m.explore();
      Picture m2 = new Picture("blueMotorcycle.jpg");
      //m2.mirrorHorizontalBotToTop();
      m2.explore();
   }
	public static void testMirrorDiagonal()
	{
		Picture m = new Picture("penguins_square.jpg");
		m.explore();
		Picture m2 = new Picture("penguins_square.jpg");
		m2.mirrorDiagonal();
		m2.explore();
	}
   /** Method to test mirrorTemple */
   public static void testMirrorTemple()
   {
      Picture temple = new Picture("temple.jpg");
      temple.explore();
      Picture temple2 = new Picture("temple.jpg");
      temple2.mirrorTemple();
      temple2.explore();
   }
	public static void testMirrorArms()
	{
		Picture arms = new Picture("snowman.jpg");
      arms.explore();
      Picture arms2 = new Picture("snowman.jpg");
      arms2.mirrorArms();
      arms2.explore();
	}
   
   /** Method to test the collage method */
   public static void testCollage()
   {
      Picture canvas = new Picture("640x480.jpg");
      canvas.createCollage();
      canvas.explore();
   }
   
   /** Method to test edgeDetection */
   public static void testEdgeDetection()
   {
      Picture swan = new Picture("swan.jpg");
      swan.explore();
      Picture swan2 = new Picture("swan.jpg");
      swan2.edgeDetection(10);
      swan2.explore();
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
      //testColorSplash();
      //testMirrorVertical();
      //testMirrorVerticalRightToLeft();
      //testMirrorHorizontal();
      //testMirrorHorizontalBotToTop();
      //testMirrorTemple();
      testMirrorArms();
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
   }
}