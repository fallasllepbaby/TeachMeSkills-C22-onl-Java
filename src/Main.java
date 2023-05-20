import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        getMonthByNumber();
        getSum();
    }

    // Method to return scanner
    public static Scanner scan(){
        return new Scanner(System.in);
    }

    // Additional task (Months)
    public static void getMonthByNumber() {

        System.out.print("Enter number of month: ");
        int month = scan().nextInt();

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

    // Additional task using loop
    public static void getSum(){
        int sum = 0;
        int number;
        do {
            System.out.print("Enter number: ");
            number = scan().nextInt();
        } while(!(number > 1));

        for(int i = 1; i < number; i++){
            sum += i;
        }
        System.out.println(sum);
    }

}