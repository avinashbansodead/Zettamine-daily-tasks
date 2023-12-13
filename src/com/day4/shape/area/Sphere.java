package com.day4.shape.area;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sphere extends Shape{
private double radius;
	public double getRadius() {
	return radius;
}


	public Sphere( double radius) {
		super();
		this.radius=radius;
	}

	@Override
	double area() {
		return (double)((double)Math.PI*Math.pow(radius,radius));
		
		
	}

	@Override
	double volume()
	{
		double volume=( 4  * Math.PI * Math.pow(radius, 3) ) / 3;
		return volume;
	}

}
