import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getMonthByNumber();
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