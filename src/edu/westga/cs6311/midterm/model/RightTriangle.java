
package edu.westga.cs6311.midterm.model;

import java.awt.geom.Point2D;

/**
 * This class allows the user to define a right triangle calculate its
 * hypothenuse perimeter and area given its bottom left point, height and base.
 * 
 * 
 * @author Ibrahim Tonifarah
 * @version 9/20/2018
 *
 */
public class RightTriangle {
	private Point2D.Double bottomLeftPoint;
	private double height;
	private double base;

	/**
	 * creates a right Triangle with a bottom left point, height, and base. This
	 * initializes the instance variables
	 * 
	 * @param xPoint xPoint is the x of the bottomLeftPoint
	 * @param yPoint yPoint is the y of the bottomLeftPoint
	 * @param height height is the height of the right triangle
	 * @param base   base is the base of the right triangle
	 */
	public RightTriangle(double xPoint, double yPoint, double height, double base) {
		this.bottomLeftPoint = new Point2D.Double(xPoint, yPoint);
		this.height = height;
		this.base = base;
	}

	/**
	 * Returns the bottom Left Point of the right triangle
	 * 
	 * @return bottomLeftPoint
	 */
	public Point2D.Double getBottomLeftPoint() {
		return this.bottomLeftPoint;
	}

	/**
	 * Returns the height of the right triangle
	 * 
	 * @return height
	 */
	public double getHeight() {
		return this.height;
	}

	/**
	 * Returns the base of the right triangle
	 * 
	 * @return Base
	 */
	public double getBase() {
		return this.base;
	}

	/**
	 * Returns the top point of the right triangle
	 * 
	 * @return topPoint
	 */
	public Point2D.Double getTopPoint() {
		Point2D.Double topPoint = new Point2D.Double(this.bottomLeftPoint.getX(),
				this.bottomLeftPoint.getY() - this.height);
		return topPoint;
	}

	/**
	 * Returns the bottom right point of the right triangle
	 * 
	 * @return bottomRightPoint
	 */
	public Point2D.Double getBottomRightPoint() {
		Point2D.Double bottomRightPoint = new Point2D.Double(this.bottomLeftPoint.getX() + this.base,
				this.bottomLeftPoint.getY());
		return bottomRightPoint;
	}

	/**
	 * Returns the hypothenuse of the right triangle
	 * 
	 * @return hypothenuse
	 */
	public double getHypothenuse() {
		return Math.sqrt((Math.pow(this.base, 2)) + (Math.pow(this.height, 2)));
	}

	/**
	 * Returns the area of the right triangle
	 * 
	 * @return area
	 */
	public double getArea() {
		return (0.50) * (this.base * this.height);
	}

	/**
	 * Returns the perimeter of the right triangle
	 * 
	 * @return perimeter
	 */
	public double getPerimeter() {
		return this.base + this.height + this.getHypothenuse();
	}

	/**
	 * Returns the area of the circumscribed circle
	 * 
	 * @return circumscribedCircleArea
	 */
	public double getCircumscribedCircleArea() {
		return Math.PI * Math.pow((this.getHypothenuse() / 2), 2);
	}

	/**
	 * Returns the area of the inscribed circle
	 * 
	 * @return InscribedCirlceArea
	 */
	public double getInscribedCircleArea() {
		double radius = this.getArea() / (this.getPerimeter() / 2);
		return Math.PI * Math.pow(radius, 2);
	}

	/**
	 * returns the ratio of the two circles
	 * 
	 * @return CicleRatio
	 */
	public double getCirlceRatio() {
		return getInscribedCircleArea() / getCircumscribedCircleArea();
	}

}
