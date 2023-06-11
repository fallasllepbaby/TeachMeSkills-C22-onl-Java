import Figures.Circle;
import Figures.Figure;
import Figures.Rectangle;
import Figures.Triangle;

public class Main {
    public static void main(String[] args) {

        // Main tasks

        // Task 1

        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(5,5);
        figures[1] = new Rectangle(5,5);
        figures[2] = new Circle(5);
        figures[3] = new Rectangle(3,3);
        figures[4] = new Circle(3);

        double perimeterSum = 0;

        for(int i = 0; i < figures.length; i++) {
            figures[i].findAreaAndPerimeter();
            perimeterSum += figures[i].getPerimeter();
        }

        System.out.println("Сумма периметров всех фигур в массиве - " + perimeterSum);

        // Task 2 (using interface = skip)

        // Additional task

        // Task 3

    }
}