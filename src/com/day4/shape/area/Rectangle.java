package com.day4.shape.area;

import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Rectangle extends Shape
{

private double length;
private double breadth;

public Rectangle( double length,double breadth) {
		super();
		this.length=length;
		this.breadth=breadth;
		
	}


@Override
	double area() {
		return length*breadth;
		
	}


@Override
double volume() {
	// TODO Auto-generated method stub
	return 0;
}
}
