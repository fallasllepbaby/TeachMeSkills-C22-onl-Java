package Figures;

public class Rectangle extends Figure{
    private int width;
    private int height;

    // Constructor
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    @Override
    public void findAreaAndPerimeter() {
        this.area = width * height;
        this.perimeter = width * 2 + height * 2;
    }
}
