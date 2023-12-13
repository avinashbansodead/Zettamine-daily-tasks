package com.day4.shape.area;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Triangle extends Shape {
private double base;
private double height;
	public Triangle(double base,double height) {
		super();
		this.base=base;
		this.height=height;
		// TODO Auto-generated constructor stub
	}

	@Override
	double area()
	{
		return(0.5*base*height);
	}

	@Override
	double volume() {
		
		return 0;
	}

	
}
