package Figures;

public abstract class Figure {
    protected double perimeter;
    protected double area;

    public double getPerimeter() {
        return perimeter;
    }

    public abstract void findAreaAndPerimeter();
}
