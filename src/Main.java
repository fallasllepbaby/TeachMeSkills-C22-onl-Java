import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Main tasks

        // Task 0
        System.out.println(hasNumber());

        // Task 1
        System.out.println(deleteAllMatches());

        // Task 2
        System.out.println(getRandomArray());

        // Task 3
        System.out.println(getTwoRandomArrays());

        // Additional tasks

        // Task 4
        System.out.println(getRestrictedRandomArray());

        // Task 5
        getOddArray();

        // Task 6
        sortNamesArray();

        // Task 7
        sortUsingBubbles();
    }

    public static Scanner scan(){
        return new Scanner(System.in);
    }

    // Main tasks

    // Task 0
    public static String hasNumber() {
        int[] array = new int[] {1, 23, 4, 5, 65, 32, 11, 12, 14};

        System.out.print("Enter number: ");
        int number = scan().nextInt();

        for(int i = 0; i < array.length; i++){
            if(array[i] == number) return "Array " + Arrays.toString(array) + " has a number " + number;
        }
        return "Array " + Arrays.toString(array) + " hasn't a number " + number;
    }

    // Task 1
    public static String deleteAllMatches(){
        int[] array = new int[] {1, 23, 4, 5, 65, 4, 11, 12, 14};
        int counter = 0;

        System.out.println(Arrays.toString(array));
        System.out.print("Enter a number: ");
        int number = scan().nextInt();
        for(int i = 0; i < array.length; i ++){
            if(array[i] == number) counter++;
        }
        int[] result = new int[array.length - counter];

        int index = 0;
        for(int i = 0; i < array.length; i++ ){
            if(array[i] != number){
                result[index++] = array[i];
            }
        }

        return Arrays.toString(result);
    }

    // Task 2
    public static String getRandomArray(){
        double sum = 0;
        System.out.print("Enter length of array: ");
        int length = scan().nextInt();
        int[] array = new int[length];
        for(int i = 0; i < array.length; i++){
            array[i] = (int) Math.floor(Math.random() * 100);
            sum += array[i];
        }
        int min = array[0];
        int max = array[0];
        double average = sum / array.length;

        for(int i = 0; i < array.length - 1; i++){
            if(array[i + 1] > max) max = array[i + 1];
            if(array[i + 1] < min) min = array[i + 1];
        }

        return Arrays.toString(array) + "\n" + "Average: " + average + "\n" + "Max value: " + max + "\n" + "Min value: " + min;
    }

    // Task 3
    public static String getTwoRandomArrays() {
        int[] array1 = new int[5];
        double sum1 = 0;
        int[] array2 = new int[5];
        double sum2 = 0;
        for(int i = 0; i < array1.length; i++) {
            array1[i] = (int) Math.floor(Math.random() * 100);
            sum1 += array1[i];
            array2[i] = (int) Math.floor(Math.random() * 100);
            sum2 += array2[i];
        }

        String result = sum1 / array1.length == sum2 / array2.length ? "Average1 and Average2 are equal" : sum1 / array1.length > sum2 / array2.length ? "Average1 more than Average2" : "Average2 more than Average1";

        return Arrays.toString(array1) + "  Average1: " + sum1 / array1.length +
                "\n" + Arrays.toString(array2) + "  Average2: " + sum2 / array2.length +
                "\n" + result;
    }

    // Additional tasks

    // Task 4
    public static String getRestrictedRandomArray() {
        int n = 0;
        int counter = 0;
        do {
            System.out.print("Enter length of array: ");
            n = scan().nextInt();
            if (!(n > 5 && n <= 10)) System.out.println("Yout length is incorrect. Please enter length from 6 to 10");
        } while (!(n > 5 && n <= 10));
        int[] array = new int[n];
        for(int i = 0; i < array.length; i++){
            array[i] = (int) Math.floor(Math.random() * 100);
        }

        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0) counter++;
        }
        if(counter == 0) return "There aren't even numbers";

        int oddIndex = 0;
        int[] oddArray =  new int[counter];
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0) oddArray[oddIndex++] = array[i];
        }
        return Arrays.toString(array) + "\n" + Arrays.toString(oddArray);
    }

    // Task 5
    public static void getOddArray(){
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = (int) Math.floor(Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < array.length; i++){
            if(i % 2 == 1) array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }

    // Task 6
    public static void sortNamesArray() {
        String[] names = new String[]{"John", "Artur", "Vlad", "Daniil", "Zak"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }

    // Task 7
    public static void sortUsingBubbles(){
        int[] array = new int[10];
        boolean isSorted = false;
        for(int i = 0; i < array.length; i++){
            array[i] = (int) Math.floor(Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
        while (!isSorted){
            isSorted = true;
            for(int i = 1; i < array.length; i++) {
                if(array[i] < array[i-1]){
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                    isSorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}