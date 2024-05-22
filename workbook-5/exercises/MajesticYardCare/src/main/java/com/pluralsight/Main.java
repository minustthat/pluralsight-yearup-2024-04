package com.pluralsight;

import com.pluralsight.models.*;
import org.w3c.dom.css.Rect;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
   public static List<Shape> shapes = new ArrayList<>();
    public static void fileShapes(){
        File shapeFile = new File("data/shapes.csv");
        String line;
        try(BufferedReader reader = new BufferedReader(new FileReader(shapeFile))){
            while((line = reader.readLine())  != null){
                String[] cols = line.split("[|]");
                String type = cols[0];
                if(type.equalsIgnoreCase("Circle")){
                   int radius = Integer.parseInt(cols[1]);
                   Circle newCircle = new Circle(radius);
                   shapes.add(newCircle);
                }
                if (type.equalsIgnoreCase("Triangle")){
                    int base = Integer.parseInt(cols[1]);
                    int height = Integer.parseInt(cols[2]);
                    Triangle newTriangle = new Triangle(base, height);
                    shapes.add(newTriangle);
                }
                if(type.equalsIgnoreCase("Rectangle")){
                    int width = Integer.parseInt(cols[1]);
                    int height = Integer.parseInt(cols[2]);
                    Rectangle newRectangle = new Rectangle(width, height);
                    shapes.add(newRectangle);
                }
                if(type.equalsIgnoreCase("Square")){
                    int sideLength = Integer.parseInt(cols[1]);
                    Square newSquare = new Square(sideLength);
                    shapes.add(newSquare);
                }

            }
        } catch (Exception e){
e.printStackTrace();
        }
}
    public static void main(String[] args)
    {
        fileShapes();
System.out.println(shapes.size());
        // load all shapes into the arraylist

        // then print the toString() of each shape
        for (Shape shape: shapes)
        {
            System.out.println(shape.toString());
        }
    }
}