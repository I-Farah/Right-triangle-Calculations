
package edu.westga.cs6311.midterm.controller.test;

import java.awt.geom.Point2D;

import edu.westga.cs6311.midterm.model.RightTriangle;

/**
 * This class is to informally test the RightTriangle class
 * 
 * @author Ibrahim Tonifarah
 * @version 9/19/2018
 */
public class RightTriangleDemo {
	private RightTriangle rightTriangle1;

	/**
	 * creates a RightTriangleDemo that initializes the rightTriangle1
	 */
	public RightTriangleDemo() {
		this.rightTriangle1 = new RightTriangle(10.0, 110.0, 100.0, 120.0);
	}

	/**
	 * Method takes in a point, expectedX and expectedY and displays the
	 * expected x and y, actual x and actual y
	 * 
	 * @param actualPoint actualPoint is a point of the right triangle
	 * @param expectedX   expectedX is the expected x of the point
	 * @param expectedY   expectedY is the expected y of the point
	 */
	public void displayPointInformation(Point2D.Double actualPoint, double expectedX, double expectedY) {
		System.out.println("\tExpected x:\t" + expectedX);
		System.out.println("\tActual x:\t" + actualPoint.getX());

		System.out.println("\tExpected y:\t" + expectedY);
		System.out.println("\tActual y:\t" + actualPoint.getY());
	}

	/**
	 * Method takes in rightTriangle, expectedHeight, and displays the
	 * expectedHeight and actual Height of the right triangle
	 * 
	 * @param rightTriangle  rightTriangle is the right triangle
	 * @param expectedHeight expectedHeight is the expected height of the right
	 *                       triangle
	 */
	public void displayHeightInformation(RightTriangle rightTriangle, double expectedHeight) {
		System.out.println("\tExpected height: " + expectedHeight);
		System.out.println("\tActual height:\t" + rightTriangle.getHeight());
	}

	/**
	 * Method takes in rightTriangle, expectedBase and displays the actual Base and
	 * expected base of the right triangle
	 * 
	 * @param rightTriangle rightTriangle is the right triangle
	 * @param expectedBase  expectedBase is the expected base of the right triangle
	 */
	public void displayBaseInformation(RightTriangle rightTriangle, double expectedBase) {
		System.out.println("\tExpected base:\t" + expectedBase);
		System.out.println("\tActual base:\t" + rightTriangle.getBase());
	}

	/**
	 * Method takes in rightTriangle, expectedHypothenuse and displays the actual
	 * Hypothenuse and expected of the right triangle
	 * 
	 * @param rightTriangle       rightTriangle is the right triangle
	 * @param expectedHypothenuse expectedHypothenuse is the expected hypothenuse of
	 *                            the right triangle
	 */
	public void displayHypotenuseInformation(RightTriangle rightTriangle, double expectedHypothenuse) {
		System.out.println("\tExpected hypothenuse:\t" + expectedHypothenuse);
		System.out.println("\tActual hypothenuse:\t" + rightTriangle.getHypothenuse());
	}

	/**
	 * Method takes in rightTriangle and expectedArea and displays expected area and
	 * actual area information
	 * 
	 * @param rightTriangle rightTriangle is the right triangle
	 * @param expectedArea  expectedArea is the expected area of the right triangle
	 */
	public void displayAreaInformation(RightTriangle rightTriangle, double expectedArea) {
		System.out.println("\tExpected Area:\t" + expectedArea);
		System.out.println("\tActual Area:\t" + rightTriangle.getArea());
	}

	/**
	 * Method takes in a rightTriangle and expectedPerimeter and displays perimeter
	 * information
	 * 
	 * @param rightTriangle     rightTriangle is the right triangle
	 * @param expectedPerimeter expectedPerimeter is the perimeter of the right
	 *                          triangle
	 */
	public void displayPerimeterInformation(RightTriangle rightTriangle, double expectedPerimeter) {
		System.out.println("\tExpected Perimeter:\t" + expectedPerimeter);
		System.out.println("\tActual Perimeter:\t" + rightTriangle.getPerimeter());
	}

	/**
	 * Method takes in a rightTriangle and expectedCircumscribedCircleArea and
	 * displays Circumscribed Area information
	 * 
	 * @param rightTriangle                   rightTriangle is the right triangle
	 * @param expectedCircumscribedCircleArea expectedCircumscribedCircleArea is the
	 *                                        expected Circumscribed Area of the
	 *                                        right triangle
	 */
	public void displayCircumscribedCircleArea(RightTriangle rightTriangle, double expectedCircumscribedCircleArea) {
		System.out.println("\tExpected Area:\t" + expectedCircumscribedCircleArea);
		System.out.println("\tActual Area:\t" + rightTriangle.getCircumscribedCircleArea());
	}

	/**
	 * Method takes in a rightTriangle and expectedInscribedCircleArea and displays
	 * InscribedCircle Area information
	 * 
	 * @param rightTriangle               rightTriangle is the right triangle
	 * @param expectedInscribedCircleArea expectedInscribedCircleArea is the
	 *                                    expected InscribedCircleArea of the right
	 *                                    triangle
	 */
	public void displayInscribedCircleArea(RightTriangle rightTriangle, double expectedInscribedCircleArea) {
		System.out.println("\tExpected Area:\t" + expectedInscribedCircleArea);
		System.out.println("\tActual Area:\t" + rightTriangle.getInscribedCircleArea());
	}

	/**
	 * Method takes in a rightTriangle and expectedCirlceRatio and displays
	 * CirlceRatio information
	 * 
	 * @param rightTriangle       rightTriangle is the right triangle
	 * @param expectedCirlceRatio expectedCirlceRatio is the expected CirlceRatio of
	 *                            the right triangle
	 */
	public void displayCirlceRatio(RightTriangle rightTriangle, double expectedCirlceRatio) {
		System.out.println("\tExpected CirlceRatio:\t" + expectedCirlceRatio);
		System.out.println("\tActual CirlceRatio:\t" + rightTriangle.getCirlceRatio());
	}

	/**
	 * Allows to test the bottomLeftPoint, height, base, topPoint, bottomRight
	 * point, area and perimeter of a right triangle
	 */
	public void testRightTrianglePart01() {
		Point2D.Double bottomLeftPoint = this.rightTriangle1.getBottomLeftPoint();
		System.out.println("This is a test of the bottom left point of the triangle");
		displayPointInformation(bottomLeftPoint, 10.0, 110.0);

		System.out.println();
		System.out.println("This is a test of the height of the triangle");
		displayHeightInformation(this.rightTriangle1, 100.0);

		System.out.println();
		System.out.println("This is a test of the base of the triangle");
		displayBaseInformation(this.rightTriangle1, 120.0);

		System.out.println();
		Point2D.Double topPoint = this.rightTriangle1.getTopPoint();
		System.out.println("This is a test of the Top Point of the triangle");
		displayPointInformation(topPoint, 10.0, 10.0);

		System.out.println();
		Point2D.Double bottomRightPoint = this.rightTriangle1.getBottomRightPoint();
		System.out.println("This is a test of the Bottom right Point of the triangle");
		displayPointInformation(bottomRightPoint, 130.0, 110.0);

		System.out.println();
		System.out.println("This is a test of the Hypotenuse of the triangle");
		displayHypotenuseInformation(this.rightTriangle1, 156.2);

		System.out.println();
		System.out.println("This is a test of the Area of the triangle");
		displayAreaInformation(this.rightTriangle1, 6000.0);

		System.out.println();
		System.out.println("This is a test of the Perimeter of the triangle");
		displayPerimeterInformation(this.rightTriangle1, 376.2);
	}

	/**
	 * Allows to test for the Circumscribed Circle Area, Inscribed Circle Area and
	 * Circle Area Ratio
	 */
	public void testRightTrianglePart02() {
		System.out.println();
		System.out.println("This is a test of the Circumscribed Circle Area of the triangle");
		displayCircumscribedCircleArea(this.rightTriangle1, 19162.49);

		System.out.println();
		System.out.println("This is a test of the Inscribed Circle Area of the triangle");
		displayInscribedCircleArea(this.rightTriangle1, 3196.50);

		System.out.println();
		System.out.println("This is a test of the Cirlce Area Ratio");
		displayCirlceRatio(this.rightTriangle1, 0.16);
	}
}
