package com.day4.shape.area;
import java.util.Scanner;

public class ShapeArrayMain 
{
	 
    public static void main(String[] args) { 
    
    Scanner input = new Scanner(System.in);
    Shape[] arrayShape = new Shape[5];
    
    	for (int i = 0; i < 5; i++) 
    	{	
    		System.out.println(" 1. Rectangle \n 2. Triangle \n 3. Cube \n 4. Sphere");
    		System.out.print("Enter the shape type: ");		
    		int option=input.nextInt();
    		
            switch (option)
            {
                case 1:
                	System.out.println("Rectangle: ");	
                    double length = input.nextDouble();
                    double width = input.nextDouble();
                    
                    arrayShape[i] = new Rectangle(length, width);
                    break;

                case 2:
                	System.out.println("Triangle: ");
                    double base = input.nextDouble();
                    double height = input.nextDouble();
                    input.nextLine(); 

                    arrayShape[i] = new Triangle(base, height);
                    break;

                case 3:
                	System.out.println("Cube: ");
                    double cubeLength = input.nextDouble();
                    double cubeWidth = input.nextDouble();
                    double cubeHeight = input.nextDouble();
                    input.nextLine(); 

                    arrayShape[i] = new Cube(cubeLength, cubeWidth, cubeHeight);
                    break;

                case 4:
                	System.out.println("Sphere: ");
                    double radius = input.nextDouble();

                    input.nextLine(); 
                    arrayShape[i] = new Sphere(radius);
                    break;

                default:

                    System.out.println("Invalid shape");
                    i--;
                    break;
            }
        }

		 for (Shape shp : arrayShape) 
		 {

	            System.out.println("Area is: " + shp.area());

	            if (shp instanceof Spatial) 
	            {
	              System.out.println("Volume is: " + shp.volume());
	            }

	     }
		
	}

}

