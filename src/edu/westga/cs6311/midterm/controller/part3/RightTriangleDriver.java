
package edu.westga.cs6311.midterm.controller.part3;

/**
 * This is the driver to informally test RightTriangleView application
 * 
 * @author Ibrahim Tonifarah
 * @version 9/21/2018
 *
 */
public class RightTriangleDriver {

	/**
	 * This is the entry point of the application
	 * 
	 * @param args Command-line arguments, not used
	 */
	public static void main(String[] args) {
		RightTriangleView rightTriangle = new RightTriangleView();
		rightTriangle.inputRightTriangleValues();
		rightTriangle.initializeRightTriangle();
		rightTriangle.demoRightTriangle();
	}
}
