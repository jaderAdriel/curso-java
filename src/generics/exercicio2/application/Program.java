package generics.exercicio2.application;

import generics.exercicio2.entities.Circle;
import generics.exercicio2.entities.Rectangle;
import generics.exercicio2.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(10.0));
        shapes.add(new Rectangle(20.0, 10.0));

        double sumAreas = totalArea(shapes);
        System.out.printf("%.2f%n", sumAreas);
    }

    public static double totalArea(List<? extends Shape> list) {
        double sumArea = 0;
        for (Shape shape : list) sumArea += shape.area();
        return sumArea;
    }
}
