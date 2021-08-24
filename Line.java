package geometry;

import java.lang.Math;

public class Line {

	 // properties
	  public int startX;
	  public int endX;
	  public int startY;
	  public int endY;


	  // constructor
	  public Line(int startX,int startY,int endX,int endY) {
		  
		if ((startX == endX) && (startY == endY)) {
			System.err.println("The coordinates of both ends of the line are the same. This is not a line but a point.");
		}
		else {
		    this.startY = startY;
		    this.startX = startX;
		    this.endX   = endX;
		    this.endY   = endY;
		}
	    
	  } 
	  
	  public void printCoords() {
		  System.out.printf("[%d:%d]----->[%d:%d]\n", startX, startY, endX, endY);
	  }
	  
	  public int length() {
		  
		  int lineLenth;
		  
		  lineLenth = (int) Math.sqrt(Math.pow(endX - startX, 2) + Math.pow(endY - startY, 2));
		  
		  return lineLenth;
	  }

}
