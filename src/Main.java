import java.security.PublicKey;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Main tasks

        // Task 1
        //createTripleArray();

        // Task 2
        createChessBoard();
    }

    public static Scanner scan(){
        return new Scanner(System.in);
    }

    // Task 1
    public static void createTripleArray(){
        // Initialization
        int[][][] tripleArray = new int[3][3][3];
        // Array filling
        for(int outer = 0; outer < tripleArray.length; outer++){
            for(int middle = 0; middle < tripleArray[outer].length; middle++){
                for(int inner = 0; inner < tripleArray[outer][middle].length; inner++){
                    tripleArray[outer][middle][inner] = (int) Math.floor(Math.random() * 100);
                }
            }
        }
        // Array output
        for(int outer[][] : tripleArray){
            for(int middle[] : outer){
                for(int inner : middle){
                    System.out.print(inner + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println();

        System.out.print("Enter number to increase array elements: ");
        int number = scan().nextInt();

        System.out.println();

        // Array increasing
        for(int outer = 0; outer < tripleArray.length; outer++){
            for(int middle = 0; middle < tripleArray[outer].length; middle++){
                for(int inner = 0; inner < tripleArray[outer][middle].length; inner++){
                    tripleArray[outer][middle][inner] += number;
                }
            }
        }

        // Array output
        for(int outer[][] : tripleArray){
            for(int middle[] : outer){
                for(int inner : middle){
                    System.out.print(inner + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    // Task 2
    public static void createChessBoard(){
        // Initialization
        String[][] chessArray = new String[8][8];
        boolean isWturn = true;

        // Filling with colors
        for(int outer = 0; outer < chessArray.length; outer++){
            for(int inner = 0; inner < chessArray[outer].length; inner++){
                chessArray[outer][inner] = isWturn ? "W" : "B";
                isWturn = !isWturn;
            }
            isWturn = !isWturn;
        }

        // Array output
        for(String outer[] : chessArray){
            for(String inner : outer){
                System.out.print(inner + "\t");
            }
            System.out.println();
        }

    }
}