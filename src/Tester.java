import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        // Control Structures

        // Task 1 (switch-case)
        System.out.println(getSeasonOfTheYear1());

        // Task 2 (if-else-if)
        System.out.println(getSeasonOfTheYear2());

        // Task 3
        System.out.println(isEven());

        // Task 4
        System.out.println(getWeatherForecast());

        // Task 5
        System.out.println(getRainbowColorByNumber());

        // Loops

        // Task 1 (for)
        printOddNumbers();

        // Task 2 (for)
        printFive();

        // Task 3 (sum)
        sumNumbers();

        // Task 4
        printMultiplesOfSeven();

        // Task 5
        printFirstTen();

        // Task 6
        printSquares();
    }

    public static Scanner scan(){
        return new Scanner(System.in);
    }

    // Control Structures
    // Task 1 (switch-case)
    public static String getSeasonOfTheYear1(){
        System.out.print("Enter number of month: ");
        int month = scan().nextInt();
        switch (month){
            case 1,2,12:
                return "Winter!";
            case 3,4,5:
                return "Spring!";
            case 6,7,8:
                return "Summer";
            case 9,10,11:
                return "Autumn";
            default:
                return "Enter correct number of month!";
        }
    }

    // Task 2 (if-else-if)
    public static String getSeasonOfTheYear2(){
        System.out.print("Enter number of month: ");
        int month = scan().nextInt();
        if (month == 1 || month == 2 || month == 12) {
            return "Winter";
        } else if (month == 3 || month == 4 || month == 5) {
            return "Spring";
        } else if (month == 6 || month == 7 || month == 8){
            return "Summer";
        } else if (month == 9 || month == 10 || month == 11) {
            return "Autumn";
        } else {
            return "Enter correct number of month!";
        }
    }

    // Task 3
    public static String isEven() {
        System.out.print("Enter number: ");
        int number = scan().nextInt();
        return number % 2 == 0 ? "Number is Even" : "Number is Odd";
    }

    // Task 4
    public static String getWeatherForecast() {
        System.out.print("Enter the outside temperature: ");
        int t = scan().nextInt();
        if (t <= -20) {
            return "Холодно";
        } else if (t > -20 && t <= -5) {
            return "Нормально";
        } else {
            return "Тепло";
        }
    }

    // Task 5
    public static String getRainbowColorByNumber() {
        System.out.print("Enter the color number in the rainbow: ");
        int color = scan().nextInt();
        switch (color) {
            case 1:
                return "1 - красный";
            case 2:
                return "2 - оранжевый";
            case 3:
                return "3 - желтый";
            case 4:
                return "4 - зеленый";
            case 5:
                return "5 - голубой";
            case 6:
                return "6 - синий";
            case 7:
                return "7 - фиолетовый";
            default:
                return "Такого цвета нет в радуге)";
        }
    }

    // Loops
    // Task 1 (for)
    public static void printOddNumbers() {
        System.out.println("Вывести на экран нечетные числа от 1 до 99");
        for(int i = 0; i < 99; i++){
            if (i % 2 == 1) System.out.print(i + " ");
        }
        System.out.println();
    }

    // Task 2 (for)
    public static void printFive() {
        System.out.println("Вывести на экран числа от 5 до 1");
        for (int i = 5; i > 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Task 3 (sum)
    public static void sumNumbers() {
        int sum = 0;
        System.out.print("Enter number: ");
        int number = scan().nextInt();
        for(int i = 0; i < number; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    // Task 4
    public static void printMultiplesOfSeven() {
        int i = 7;
        System.out.println("Последовательность: ");
        while (i <= 98){
            System.out.print(i + " ");
            i += 7;
        }
        System.out.println();
    }

    // Task 5
    public static void printFirstTen() {
        System.out.println("Вывести 10 первых чисел последовательности 0, -5,-10,-15...");
        for (int i = 0; i < 10; i++){
            System.out.print(-5 * i + " ");
        }
        System.out.println();
    }

    // Task 6
    public static void printSquares() {
        System.out.println("Вывести на экран квадраты чисел от 10 до 20 включительно");
        for (int i = 10; i <= 20; i++) {
            System.out.println(i + " --> " + i*i);
        }
    }
}