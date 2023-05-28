import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        guessWord();
    }

    public static Scanner scan(){
        return new Scanner(System.in);
    }
    public static void guessWord(){
        boolean isWin = false;
        String[] wordArray = new String[]{"j", "a", "v", "a"};

        String[] encryptedWordArray = new String[wordArray.length];
        for(int i = 0; i < encryptedWordArray.length; i++){
            encryptedWordArray[i] = "_";
        }

        String word = "";
        for(int i = 0; i < wordArray.length; i++){
            word += wordArray[i];
        }

        String encryptedWord = "";
        for(int i = 0; i < encryptedWordArray.length; i++){
            encryptedWord += encryptedWordArray[i];
        }

        while(!isWin){
            System.out.println("Guess the word : " + encryptedWord);
            System.out.print("Enter a letter or a whole word: ");
            String guess = scan().next();
            guess = guess.toLowerCase();

            if(guess.length() == 1){
                for (int i = 0; i < wordArray.length; i++){
                    if(guess.equals(wordArray[i])){
                        encryptedWordArray[i] = guess;

                        encryptedWord = "";
                        for(int n = 0; n < encryptedWordArray.length; n++){
                            encryptedWord += encryptedWordArray[n];
                        }

                        if(!encryptedWord.contains("_")){
                            System.out.println("You Won! Congratulations!");
                            isWin = true;
                        }
                    }
                }
            } else if(guess.length() == wordArray.length){
                if(guess.equals(word)){
                    System.out.println("You Won! Congratulations!");
                    isWin = true;
                }
            } else {
                System.out.println("Wrong Input!");
            }
        }
    }

}