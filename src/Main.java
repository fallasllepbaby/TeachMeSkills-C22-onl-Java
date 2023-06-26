import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Main tasks

        // Task 1


        String str = "1234-abc-5678-efg-1a2b";

        DocumentString.showTwoDigitBlocks(str);

        DocumentString.showWithReplacement(str);

        DocumentString.showOnlyLetters(str);

        DocumentString.showOnlyLettersStringBuilder(str);

        DocumentString.containsABC(str);

        DocumentString.startsWith555(str);

        DocumentString.endsWith1a2b(str);



        // Task 2

        doubleEveryLetter("Hello");

        // Additional tasks

        // Task 3

        minMaxWords("Word length is the best place that i have ever seen would you be so kind to close the door rjrjrj");

        // Task 4

        findWord("fff uuuuuuuuuuuuu jfdjfkdfjkd ldfkjdklfjdfkd jdjdjdjdjd");

        // Task 5

        chooseWord("word baby wow Wow row");

    }

    // Main tasks

    // Task 2
    public static void doubleEveryLetter(String str) {
        String doubledString = "";
        for (int i = 0; i < str.length(); i++) {
            doubledString += str.substring(i, i + 1);
            doubledString += str.substring(i, i + 1);
        }
        System.out.println(doubledString);
    }

    // Additional tasks

    // Task 3

    public static void minMaxWords(String str) {
        String[] words = str.split(" ");
        String min = words[0];
        String max = words[0];

        for (int i = 0; i < words.length - 1; i++) {
            if (min.length() >= words[i + 1].length()) {
                min = words[i + 1];
            }
            if (max.length() <= words[i + 1].length()) {
                max = words[i + 1];
            };
        }

        System.out.println("Max word: " + max + "\n" + "Min word: " + min);
    }

    // Task 4

    public static void findWord(String str) {
        System.out.println(str);
        String[] wordArray = str.split(" ");
        String[] processedWordArray = str.split(" ");
        for (int i = 0; i < processedWordArray.length; i++) {
            String result = new StringBuilder(processedWordArray[i]).reverse().toString();
            result = result.replaceAll("(.)(?=.*\\1)", "");
            result = new StringBuilder(result).reverse().toString();
            processedWordArray[i] = result;
        }

        String min = processedWordArray[0];
        int index = 0;
        for (int i = 0; i < processedWordArray.length - 1; i++) {
            if (min.length() > processedWordArray[i + 1].length()) {
                index = i + 1;
            }
        }
        System.out.println(wordArray[index]);
    }

    // Task 5

    private static Scanner scan() {
        return new Scanner(System.in);
    }

    private static boolean isPalindrome(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return str.equalsIgnoreCase(stringBuilder.reverse().toString());
    }

    public static void chooseWord(String str) {
        String[] wordArray = str.split(" ");
        System.out.println(str);
        System.out.print("Введите номер слова, которое вы хотите проверить: ");
        int wordNumber = scan().nextInt();
        if (isPalindrome(wordArray[wordNumber])) {
            System.out.println(wordArray[wordNumber] + " является палиндромом.");
        } else {
            System.out.println(wordArray[wordNumber] + " не является палиндромом.");
        }
    }
}