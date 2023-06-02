import java.security.PublicKey;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Main tasks

        // Task 1
        //createTripleArray();

        // Task 2
        //createChessBoard();

        // Task 3
        //multiplyTwoArrays();

        // Task 4
        //sumAllElementsOfArray();

        // Task 5
        //getDiagonalsOfArray();

        // Task 6
        //sortRowsOfArray();
    }

    public static Scanner scan(){
        return new Scanner(System.in);
    }

    public static int[] sortUsingBubbles(int[] array){
        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] > array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
        return array;
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

    // Task 3
//    public static void multiplyTwoArrays(){
//        int[][] firstArray = new int[][] {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
//        System.out.println(Arrays.deepToString(firstArray));
//        int[][] secondArray = new int[][]  {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
//        System.out.println(Arrays.deepToString(secondArray));
//        int[][] result = new int[firstArray.length][secondArray[0].length];
//
//        for(int outer = 0; outer < firstArray.length; outer++){
//            for(int inner = 0; inner < secondArray[outer].length; inner++){
//                result[outer][inner] = firstArray[outer][inner] * secondArray[outer][inner] + firstArray[outer][inner + 1] * secondArray[outer + 1][inner] + firstArray[outer][inner + 2] * secondArray[outer + 2][inner] + firstArray[outer][inner + 3] * secondArray[outer + 3][inner];
//            }
//        }
//
//        for(int outer[] : result){
//            for(int inner : outer){
//                System.out.print(inner + "\t");
//            }
//            System.out.println();
//        }
//    }

    // Task 4
    public static void sumAllElementsOfArray() {
        int sum = 0;

        System.out.print("Enter amount of rows: ");
        int rows = scan().nextInt();
        System.out.print("Enter amount of columns: ");
        int columns = scan().nextInt();

        int[][] array = new int[rows][columns];

        // Initialization
        for(int outer = 0; outer < rows; outer++) {
            for(int inner = 0; inner < columns; inner++) {
                array[outer][inner] = (int) Math.floor(Math.random() * 100);
            }
        }

        // Output
        for (int outer[] : array){
            for(int inner : outer){
                System.out.print(inner + "\t");
            }
            System.out.println();
        }

        // Sum
        for (int outer[] : array){
            for(int inner : outer){
                sum += inner;
            }
        }

        System.out.println("Sum of all elements: " + sum);
    }

    // Task 5
    public static void getDiagonalsOfArray(){
        System.out.print("Enter amounts of rows: ");
        int rows = scan().nextInt();
        int[][] array = new int[rows][rows];

        // Initialization
        for(int outer = 0; outer < rows; outer++) {
            for(int inner = 0; inner < rows; inner++) {
                array[outer][inner] = (int) Math.floor(Math.random() * 100);
            }
        }

        // Output
        for (int outer[] : array){
            for(int inner : outer){
                System.out.print(inner + "\t");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Main diagonal");
        for(int outer = 0; outer < rows; outer++) {
            for(int inner = 0; inner < rows; inner++) {
                if(outer == inner){
                    System.out.print(array[outer][inner] + "\t");
                }
            }
        }
        System.out.println();

        System.out.println("Additional diagonal");
        for(int outer = 0; outer < array.length; outer++){
            System.out.print(array[outer][array[outer].length - 1 - (outer * 1)] + "\t");
        }
    }

    // Task 6
    public static void sortRowsOfArray(){
        System.out.print("Enter amounts of rows: ");
        int rows = scan().nextInt();
        int[][] array = new int[rows][rows];

        // Initialization
        for(int outer = 0; outer < rows; outer++) {
            for(int inner = 0; inner < rows; inner++) {
                array[outer][inner] = (int) Math.floor(Math.random() * 100);
            }
        }

        // Output
        for (int outer[] : array){
            for(int inner : outer){
                System.out.print(inner + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("After sorting");

        for(int outer = 0; outer < array.length; outer++){
            sortUsingBubbles(array[outer]);
        }

        // Output
        for (int outer[] : array){
            for(int inner : outer){
                System.out.print(inner + "\t");
            }
            System.out.println();
        }
    }
}