package Figures;

public class Circle extends Figure{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public void findAreaAndPerimeter() {
        this.area = Math.PI * Math.pow(radius, 2);
        this.perimeter = 2 * Math.PI * radius;
    }
}
