package com.day4.shape.area;

public class Cube extends Shape
{
private double length;
private double width;
private double height;
public Cube( double length, double width, double height) {
	super();
	this.length = length;
	this.width = width;
	this.height = height;
}
@Override
double area() {
	double area=2 * length * width + 2 * length * height + 2* width * height;
	return area;
}
@Override
double volume() {
	double volume=length * width * height;
	return volume;
}

}
