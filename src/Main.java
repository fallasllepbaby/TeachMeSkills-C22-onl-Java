import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //getData();
        convertCharToInt();
    }

    public static void getData(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your height: ");
        int height = scanner.nextInt();

        System.out.print("Enter your weight: ");
        float weight = scanner.nextFloat();

        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }

    public static void convertCharToInt(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter char: ");
        char symbol = scanner.next().charAt(0);
        System.out.println(symbol + "-" + (int) symbol);
    }

}