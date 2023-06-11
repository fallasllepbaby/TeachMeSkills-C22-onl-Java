package Figures;

public class Triangle extends Figure{

    private int side;
    private int height;

    // Constructor
    public Triangle(int side, int height){
        this.side = side;
        this.height = height;
    }
    @Override
    public void findAreaAndPerimeter() {
        this.area = side * height / 2;
        this.perimeter = side * 3;
    }
}
