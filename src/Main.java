import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        getData();
//        convertCharToInt();
//        countBMI();
        getMonthByNumber();
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

    // BMI (Body Mass Index)
    public static void countBMI(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight: ");
        float weight = scanner.nextFloat();

        System.out.print("Enter your height: ");
        float height = scanner.nextFloat();

        float bmi = (float) (weight / Math.pow(height / 100, 2));
        System.out.print("BMI = " + String.format("%.2f", bmi));
    }

    // Method to return scanner
    public static Scanner scan(){
        return new Scanner(System.in);
    }

    // Additional task
    public static void getMonthByNumber() {
        int month = 0;
        boolean check = true;
        /*
        do {
            System.out.print("Enter number of month: ");
            month = scan().nextInt();
        } while (!(month > 0 && month < 13));
        */
        System.out.print("Enter number of month: ");
        month = scan().nextInt();

        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("There is no such month in the year!");
        }
    }
}