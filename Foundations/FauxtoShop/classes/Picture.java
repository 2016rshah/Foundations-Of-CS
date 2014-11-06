import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
///////////////////// constructors //////////////////////////////////

/**
* Constructor that takes no arguments 
*/
   public Picture ()
   {
   /* not needed but use it to show students the implicit call to super()
   * child constructors always call a parent constructor 
   */
      super();  
   }

/**
* Constructor that takes a file name and creates the picture 
* @param fileName the name of the file to create the picture from
*/
   public Picture(String fileName)
   {
   // let the parent class handle this fileName
      super(fileName);
   }

/**
* Constructor that takes the width and height
* @param height the height of the desired picture
* @param width the width of the desired picture
*/
   public Picture(int height, int width)
   {
   // let the parent class handle this width and height
      super(width,height);
   }

/**
* Constructor that takes a picture and creates a 
* copy of that picture
* @param copyPicture the picture to copy
*/
   public Picture(Picture copyPicture)
   {
   // let the parent class do the copy
      super(copyPicture);
   }

/**
* Constructor that takes a buffered image
* @param image the buffered image to use
*/
   public Picture(BufferedImage image)
   {
      super(image);
   }

////////////////////// methods ///////////////////////////////////////

   public Picture getPicture()
   {
      return this;
   }	

/**
* Method to return a string with information about this picture.
* @return a string with information about the picture such as fileName,
* height and width.
*/
   public String toString()
   {
      String output = "Picture, filename " + getFileName() + 
         " height " + getHeight() 
         + " width " + getWidth();
      return output;
   }

/** 
* Method to set the blue to 0 
* 
*/
   public void zeroBlue()
   {
      Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels)
      {
         for (Pixel pixelObj : rowArray)
         {
            pixelObj.setBlue(0);
         }
      }
   }

 
/** 
* Method to keep just the blue 
* 
*/       
   public void keepOnlyBlue()
   {
		Pixel[][] pixels = this.getPixels2D();
		for(Pixel[] rowArray : pixels)
		{
			for(Pixel pixelObj : rowArray)
			{
				pixelObj.setRed(0);
				pixelObj.setGreen(0);
			}
		}
   
   }
	public void keepOnlyRed()
   {
		Pixel[][] pixels = this.getPixels2D();
		for(Pixel[] rowArray : pixels)
		{
			for(Pixel pixelObj : rowArray)
			{
				pixelObj.setBlue(0);
				pixelObj.setGreen(0);
			}
		}
   
   }
	public void keepOnlyGreen()
   {
		Pixel[][] pixels = this.getPixels2D();
		for(Pixel[] rowArray : pixels)
		{
			for(Pixel pixelObj : rowArray)
			{
				pixelObj.setRed(0);
				pixelObj.setBlue(0);
			}
		}
   
   }
	

/** 
* Method to negate the picture
* 
*/
   public void negate()
   {
		Pixel[][] pixels = this.getPixels2D();
			for(Pixel[] rowArray : pixels)
			{
				for(Pixel pixelObj : rowArray)
				{
					pixelObj.setRed((255-pixelObj.getRed()));
					pixelObj.setBlue((255-pixelObj.getBlue()));
					pixelObj.setGreen((255-pixelObj.getGreen()));
				}
			}
	}		

/** 
* Method to grayscale the picture
*/
   public void grayscale()
   {
   	Pixel[][] pixels = this.getPixels2D();
		for(Pixel[] rowArray : pixels)
		{
			for(Pixel pixelObj : rowArray)
			{
				int x = ((pixelObj.getRed()+pixelObj.getBlue()+pixelObj.getGreen())/3);
				pixelObj.setRed(x);
				pixelObj.setBlue(x);
				pixelObj.setGreen(x);
			}
		}
   }

   public void fixUnderwater()
   {
   	Pixel[][] pixels = this.getPixels2D();
		for(Pixel[] rowArray : pixels)
		{
			for(Pixel pixelObj : rowArray)
			{
// 				pixelObj.setBlue(pixelObj.getBlue()/2);
// 				pixelObj.setGreen(pixelObj.getGreen()/2);
				pixelObj.setRed(pixelObj.getRed()*5);
			}
		}
   } 
	  /** Method that mirrors the picture around a 
 * vertical mirror in the center of the picture
 * from left to right */
   public void mirrorVertical()
   {
      Pixel[][] pixels = this.getPixels2D();
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      int width = pixels[0].length;
      for (int row = 0; row < pixels.length; row++)
      {
         for (int col = 0; col < width / 2; col++)
         {
            leftPixel = pixels[row][col];
            rightPixel = pixels[row][width - 1 - col];
            rightPixel.setColor(leftPixel.getColor());
         }
      } 
   }
	public void mirrorVerticalRightToLeft()
	{
		Pixel[][] pixels = this.getPixels2D();
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      int width = pixels[0].length;
      for (int row = 0; row < pixels.length; row++)
      {
         for (int col = width-1; col > width / 2; col--)
         {
            leftPixel = pixels[row][col];
            rightPixel = pixels[row][width - 1 - col];
            rightPixel.setColor(leftPixel.getColor());
         }
      }
		
	}
	public void mirrorHorizontal()
	{
   	Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel botPixel = null;
		int height = pixels.length; 
		for( int row = 0; row<height/2; row++)
		{
			for(int col = 0; col < pixels[0].length; col++)
			{
				topPixel = pixels[row][col];
				botPixel = pixels[height-1-row][col];
				botPixel.setColor(topPixel.getColor());
			}
		} 
	}
	public void mirrorDiagonal()
	{
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel botPixel = null;
      int width = pixels[0].length;
		int height = pixels.length;
      for (int row = 0; row < pixels.length; row++)
      {
         for (int col = 0; col < width-row; col++)
         {
            topPixel = pixels[row][col];
            botPixel = pixels[height-1-row][width-1-col];
            topPixel.setColor(botPixel.getColor());
         }
      }
	}

/** Mirror just part of a picture of a temple */
   public void mirrorTemple()
   {
		int mirrorPoint = 276; 
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		int count2= 0;
		Pixel[][] pixels = this.getPixels2D();
		for(int row = 27; row<97; row++)
		{
			for(int col = 13; col<mirrorPoint; col++)
			{
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col +mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
				count++;
				
			}
			count2++;
		}
		System.out.println(count);
		System.out.println(count2);
   }
	public void mirrorArms()
   {
		int mirrorPoint = 172; 
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		int count2= 0;
		Pixel[][] pixels = this.getPixels2D();
		for(int row = 153; row<192; row++)
		{
			for(int col = 100; col<mirrorPoint; col++)
			{
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col +mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
				count++;
				
			}
			count2++;
		}
		System.out.println(count);
		System.out.println(count2);
   }
	

/** copy from the passed fromPic to the
 * specified startRow and startCol in the
 * current picture
 * @param fromPic the picture to copy from
 * @param startRow the start row to copy to
 * @param startCol the start col to copy to
 */
   public void copy(Picture fromPic, 
              int startRow, int startCol)
   {
      Pixel fromPixel = null;
      Pixel toPixel = null;
      Pixel[][] toPixels = this.getPixels2D();
      Pixel[][] fromPixels = fromPic.getPixels2D();
      for (int fromRow = 0, toRow = startRow; 
      fromRow < fromPixels.length &&
      toRow < toPixels.length; 
      fromRow++, toRow++)
      {
         for (int fromCol = 0, toCol = startCol; 
         fromCol < fromPixels[0].length &&
         toCol < toPixels[0].length;  
         fromCol++, toCol++)
         {
            fromPixel = fromPixels[fromRow][fromCol];
            toPixel = toPixels[toRow][toCol];
            toPixel.setColor(fromPixel.getColor());
         }
      }   
   }

/** Method to create a collage of several pictures */
   public void createCollage()
   {
//       Picture flower1 = new Picture("flower1.jpg");
//       Picture flower2 = new Picture("flower2.jpg");
//       this.copy(flower1,0,0);
//       this.copy(flower2,100,0);
//       this.copy(flower1,200,0);
//       Picture flowerNoBlue = new Picture(flower2);
//       flowerNoBlue.zeroBlue();
//       this.copy(flowerNoBlue,300,0);
//       this.copy(flower1,400,0);
//       this.copy(flower2,500,0);
//       this.mirrorVertical();
//       this.write("collage.jpg");
			Picture bCar = new Picture("blueCar.jpg");
			Picture rCar = new Picture("redCar.jpg");
			Picture icecream = new Picture("sundae.jpg");
			Picture pMoney = new Picture("pMoney.jpg");
			Picture pDance = new Picture("pDance.jpg");
			this.copy(bCar, 0, 0);
			this.copy(rCar, 0, 600);
			this.copy(icecream, 0, 330);
			this.copy(icecream, 0, 460);
			this.copy(pMoney, 200, 330);
			this.copy(pDance, 250, 0);
			this.copy(pDance, 250, 460);
			
   }


/** Method to show large changes in color 
 * @param edgeDist the distance for finding edges
 */
   public void edgeDetection(int edgeDist)
   {
//       Pixel leftPixel = null;
//       Pixel rightPixel = null;
//       Pixel[][] pixels = this.getPixels2D();
//       Color rightColor = null;
//       for (int row = 0; row < pixels.length; row++)
//       {
//          for (int col = 0; col < pixels[0].length-1; col++)
//          {
//             leftPixel = pixels[row][col];
//             rightPixel = pixels[row][col+1];
//             rightColor = rightPixel.getColor();
//             if (leftPixel.colorDistance(rightColor) > edgeDist)
//                leftPixel.setColor(Color.BLACK);
//             else
//                leftPixel.setColor(Color.WHITE);
//          }
//       }
			Pixel topPixel = null;
			Pixel botPixel = null;
			Pixel[][] pixels = this.getPixels2D();
			Color botColor = null;
			for(int row = 0; row <pixels.length-1; row++)
			{
				for(int col = 0; col<pixels[0].length; col++)
				{
					topPixel = pixels[row][col];
					botPixel = pixels[row+1][col];
					botColor = botPixel.getColor();
					if(topPixel.colorDistance(botColor) >edgeDist)
						topPixel.setColor(Color.BLACK);
					else
						topPixel.setColor(Color.WHITE);
				}
			}
   }

    /** 
* Method to posterize the picture
* 
*/public void redIt()
	{
			Pixel[][] pixels = this.getPixels2D();
			for(int row = pixels.length/2; row<pixels.length; row++)
			{
				for(int col = 0; col<pixels[0].length; col++)
				{
					
					pixels[row][col].setRed(255);
				}
			}
			
	}
	public void blueIt()
	{
		Pixel[][] pixels = this.getPixels2D();
		for(int row = 0; row<pixels.length; row++)
		{
			for(int col = 600; col<pixels[0].length; col++)
			{
				pixels[row][col].setBlue(255);
			}
		}
	}
	public void whiteIt()
	{
		Pixel[][] pixels = this.getPixels2D();
		for(int row = 0; row<pixels.length/2; row++)
		{
			for(int col = 0; col<pixels[0].length; col++)
			{
				int x = ((pixels[row][col].getRed()+pixels[row][col].getBlue()+pixels[row][col].getGreen())/3);
				pixels[row][col].setRed(x);
				pixels[row][col].setBlue(x);
				pixels[row][col].setGreen(x);

			}
		}
	}
	
   public void posterize()
   {
     
   }
	
/** 
* Method to pixelate the picture (Donky Kong effect)
* 
*/
   public void pixelate()
   {
 			Pixel midP = null;
			Pixel tlP = null;
			Pixel tP = null;
			Pixel trP = null;
			Pixel lP = null;
			Pixel rP = null;
			Pixel blP = null;
			Pixel bP = null;
			Pixel brP = null;
			//Pixel[][] temp = new Pixel[3][3];
			Pixel[][] pixels = this.getPixels2D();
// 			int x = -1;
// 			int y = -1; 
			for(int row = 1; row <pixels.length-1; row+=3)
			{
				for(int col = 1; col<pixels[0].length-1; col+=3)
				{
					midP = pixels[row][col];
					
					
// 					for(int r = 0; r<3; r++)
// 					{
// 						for(int c = 0; c<3; c++)
// 						{
// 							temp[r][c] = pixels[row+x][col+y];
// 							x=x+1;
// 							y=y+1;
// 						}
// 					}
// 					for(int rows = 0; rows<3; row++)
// 					{
// 						for(int cols = 0; cols<3; cols++)
// 						{
// 							pixels[row+x][col+y].setColor(midP.getColor());
// 							x=x+1;
// 							y=y+1;
// 							if(x<=1)
// 							{
// 								x=x+1;
// 							}
// 							else
// 							{
// 								break;
// 							}
// 							if(y<=1)
// 							{
// 								y=y+1;
// 							}
// 							else
// 							{
// 								break;
// 							}
// 							}
// 						}
					//temp[r][c].setColor(midP.getColor());
				
					tlP = pixels[row-1][col-1];
					tP = pixels[row-1][col];
					trP = pixels[row-1][col+1];
					lP = pixels[row][col-1];
					rP = pixels[row][col+1];
					blP = pixels[row+1][col-1];
					bP = pixels[row+1][col];
					brP = pixels[row+1][col+1];
					
					
					tlP.setColor(midP.getColor());
					tP.setColor(midP.getColor());
					trP.setColor(midP.getColor());
					lP.setColor(midP.getColor());
					rP.setColor(midP.getColor());
					blP.setColor(midP.getColor());
					bP.setColor(midP.getColor());
					brP.setColor(midP.getColor());
					
					
				}
			}

   }
	
	
/** 
* Method to sepia tone the picture
* 
*/
   public void sepiatone()
   {
     
   }		
	
/** 
* Method to blur the picture
* 
*/
   public void blur()
   {
   }			


/** 
* Method to calculate the distance between two colors
* 
*/        
   public double distance(Pixel p, Color c)
   {
   
      return Math.sqrt( Math.pow ( Math.abs (p.getRed()-c.getRed() ),2 ) +
                   Math.pow ( Math.abs (p.getGreen()-c.getGreen() ),2 ) +
             		 Math.pow ( Math.abs (p.getBlue()-c.getBlue() ),2 ) );	
   }

/** 
* Method to color splash a picture
* 
*/  	
   public void colorSplash(Color c)//253 83 50
   {
   	
   }	


     /** 
* Method to modify red by some parameter 
* 
*/  
   public void modifyRed(int x)
   {
      Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels)
      {
         for (Pixel pixelObj : rowArray)
         {
            pixelObj.setRed((int)(255*(x/100.0)));
         }
      }
   }

 /** Hide a black and white message in the current
    * picture by changing the red to even and then
    * setting it to odd if the message pixel is black 
    * @param messagePict the picture with a message
    */
   public void encode(Picture messagePict)
   {
   }
 /**
   * Method to decode a message hidden in the
   * red value of the current picture
   * @return the picture with the hidden message
   */
   public Picture decode()
   {
      return null;
   }

/* Main method for testing - each class in Java can have a main 
* method 
*/
   public static void main(String[] args) 
   {
   // Picture beach = new Picture("beach.jpg");
   //     beach.explore();
   //     beach.zeroBlue();
   //     beach.explore();
   }

} // this } is the end of class Picture, put all new methods before this
