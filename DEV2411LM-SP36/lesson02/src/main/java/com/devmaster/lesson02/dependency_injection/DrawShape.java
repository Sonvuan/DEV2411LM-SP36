package com.devmaster.lesson02.dependency_injection;


//dependency ịnection
interface Shape {
    void draw();
}
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }

}
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}

public class DrawShape {
    private Shape shape;
    public DrawShape(Shape shape) {
        this.shape = shape;
    }
    public void Draw() {
        shape.draw();
    }
    public static void main(String[] args) {
        DrawShape drawShape = new DrawShape(new Circle());
        drawShape.Draw();

        drawShape = new DrawShape(new Rectangle());
        drawShape.Draw();
    }
}
