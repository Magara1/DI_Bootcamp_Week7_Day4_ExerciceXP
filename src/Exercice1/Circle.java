package Exercice1;

import java.math.*;

public class Circle {
	
	//class attributes
	
	private double ray;
	
	//constructor without parameter

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	//constructor with parameter
	
	public Circle(double ray) {
		super();
		this.ray = ray;
	}

	
	//getter and setter
	
	public double getRay() {
		return ray;
	}

	public void setRay(double ray) {
		this.ray = ray;
	}
	
	//class method
	
	
	public double Area() {
		
		double ray = 0.0;
		
		double area = 0.0;
		
		area = Math.PI*Math.pow(ray, 2);
		
		return area;
	}
	
	public double Perimeter() {
		
		double ray = 0.0;
		
		double perimeter = 0.0;
		
		perimeter = Math.PI*ray*2;
		
		return perimeter;
	}
	
	
	
	
	
	

}
