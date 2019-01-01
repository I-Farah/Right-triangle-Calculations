
package edu.westga.cs6311.midterm.controller.part3;

import java.util.Scanner;

import edu.westga.cs6311.midterm.model.RightTriangle;

/**
 * This class allows a user to create a right triangle given bottom left point,
 * height and base
 * 
 * @author Ibrahim Tonifarah
 * @version 9/21/2018
 *
 */
public class RightTriangleView {
	private RightTriangle rightTriangle;
	private double xCoordinate;
	private double yCoordinate;
	private double height;
	private double base;
	private Scanner scan;

	/**
	 * creates a user RightTriangle and initializes the instance variables
	 */
	public RightTriangleView() {
		this.scan = new Scanner(System.in);
		this.rightTriangle = null;
		this.xCoordinate = 0.0;
		this.yCoordinate = 0.0;
		this.height = 0.0;
		this.base = 0.0;
	}

	/**
	 * creates the input values for the right triangle
	 */
	public void inputRightTriangleValues() {
		System.out.print("Enter x coordinate: ");
		this.xCoordinate = this.scan.nextDouble();

		System.out.print("Enter y coordinate: ");
		this.yCoordinate = this.scan.nextDouble();

		System.out.print("Enter height: ");
		this.height = this.scan.nextDouble();

		System.out.print("Enter base: ");
		this.base = this.scan.nextDouble();

	}

	/**
	 * Method allows to initialize the right triangle based on user input values
	 */
	public void initializeRightTriangle() {
		this.rightTriangle = new RightTriangle(this.xCoordinate, this.yCoordinate, this.height, this.base);
	}

	/**
	 * Method allows to display the results of the right triangle
	 */
	public void demoRightTriangle() {
		System.out.println();
		System.out.println("This is the results of the right triangle based on user input");
		System.out.println("\tBottom left point: " + this.rightTriangle.getBottomLeftPoint());
		System.out.println("\tHeight: " + this.rightTriangle.getHeight());
		System.out.println("\tBase: " + this.rightTriangle.getBase());
		System.out.println("\tTop Point: " + this.rightTriangle.getTopPoint());
		System.out.println("\tBottom Right Point: " + this.rightTriangle.getBottomRightPoint());
		System.out.println("\tHypothenuse: " + this.rightTriangle.getHypothenuse());
		System.out.println("\tArea: " + this.rightTriangle.getArea());
		System.out.println("\tPerimeter: " + this.rightTriangle.getPerimeter());
		System.out.println("\tCircumscribed Area: " + this.rightTriangle.getCircumscribedCircleArea());
		System.out.println("\tInscribed Area: " + this.rightTriangle.getInscribedCircleArea());
		System.out.println("\tCircle Ratio: " + this.rightTriangle.getCirlceRatio());
	}
}
