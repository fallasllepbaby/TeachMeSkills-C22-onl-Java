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

        // Additional tasks

        // Task 3
        multiplyTwoArrays();

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
    public static void multiplyTwoArrays(){
        // First array
        System.out.print("Enter amount of row in first array: ");
        int rows1 = scan().nextInt();
        System.out.print("Enter amount of columns in first array: ");
        int columns1 = scan().nextInt();

        int[][] array1 = new int[rows1][columns1];
        for(int outer = 0; outer < array1.length; outer++){
            for(int inner = 0; inner < array1[outer].length; inner++){
                array1[outer][inner] = (int) Math.floor(Math.random() * 3);
            }
        }

        // Second array
        System.out.print("Enter amount of row in second array: ");
        int rows2 = scan().nextInt();
        System.out.print("Enter amount of columns in second array: ");
        int columns2 = scan().nextInt();

        int[][] array2 = new int[rows2][columns2];
        for(int outer = 0; outer < array2.length; outer++){
            for(int inner = 0; inner < array2[outer].length; inner++){
                array2[outer][inner] = (int) Math.floor(Math.random() * 3);
            }
        }

        System.out.println("First matrix");
        for(int[] outer : array1){
            for(int inner : outer){
                System.out.print(inner + "\t");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Second matrix");
        for(int[] outer : array2){
            for(int inner : outer){
                System.out.print(inner + "\t");
            }
            System.out.println();
        }

        // Check possibility to multiply arrays
        if(columns1 != rows2){
            System.out.println();
            System.out.println("You can't multiply these matrix");
            return;
        }

        // Initialization final array
        int[][] resultArray = new int[rows1][columns2];

        // Multiply matrix
        int sum = 0;
        for (int outer = 0; outer < resultArray.length; outer++){
            for(int inner = 0; inner < resultArray[outer].length; inner++){
                for(int rows = 0, columns = 0; rows < array1.length - 1; rows++, columns++){
                    sum += array1[outer][columns] * array2[rows][inner];
                }
                resultArray[outer][inner] = sum;
                sum = 0;
            }
        }

        System.out.println();

        System.out.println("Result matrix");
        for(int[] outer : resultArray){
            for(int inner : outer){
                System.out.print(inner + "\t");
            }
            System.out.println();
        }

    }

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