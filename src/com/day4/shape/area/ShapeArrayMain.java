package com.day4.shape.area;



import java.util.Scanner;



public class ShapeArrayMain {



    public static void main(String[] args) {

        Shape[] arrayShape = new Shape[5];

        Scanner input = new Scanner(System.in);



        for (int i = 0; i < 5; i++) {

            String shape = input.nextLine();



            switch (shape) {

                case "Rectangle":

                    double length = input.nextDouble();

                    double width = input.nextDouble();

                    input.nextLine(); 

                    arrayShape[i] = new Rectangle(length, width);

                    break;

                case "Triangle":

                    double base = input.nextDouble();

                    double height = input.nextDouble();

                    input.nextLine(); 

                    arrayShape[i] = new Triangle(base, height);

                    break;

                case "Cube":

                    double cubeLength = input.nextDouble();

                    double cubeWidth = input.nextDouble();

                    double cubeHeight = input.nextDouble();

                    input.nextLine(); 

                    arrayShape[i] = new Cube(cubeLength, cubeWidth, cubeHeight);

                    break;

                case "Sphere":

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



        for (Shape shp : arrayShape) {

            System.out.println("Area is = " + shp.area());



            if (shp instanceof Spatial) {

                System.out.println("Volume is = " + shp.volume());

            }

        }

    }

}

