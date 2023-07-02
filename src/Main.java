import AdditionalTask.LoginPassword;
import AdditionalTask.WrongLoginException;
import AdditionalTask.WrongPasswordException;
import MainTask.ContainsAbcException;
import MainTask.DocumentString;
import MainTask.EndsWith1a2bException;
import MainTask.StartsWith555Exception;

public class Main {
    public static void main(String[] args) {

        // Main tasks

        // Task 1

        String str = "1234-aic-5678-efg-1a2b";

        DocumentString.showTwoDigitBlocks(str);

        DocumentString.showWithReplacement(str);

        DocumentString.showOnlyLetters(str);

        DocumentString.showOnlyLettersStringBuilder(str);

        try {
            DocumentString.containsABC(str);
        } catch (ContainsAbcException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            DocumentString.startsWith555(str);
        } catch (StartsWith555Exception exception) {
            System.out.println(exception.getMessage());
        }

        try {
            DocumentString.endsWith1a2b(str);
        } catch (EndsWith1a2bException exception) {
            exception.getMessage();
        }



        // Additional tasks

        // Task 1

        String login = "danikLaparevich";
        String password = "qwerty24";
        String confirmPassword = "qwerty24";

        try {
            System.out.println(LoginPassword.checkLoginAndPassword(login,password,confirmPassword));
        } catch (WrongLoginException exception) {
            System.out.println(exception.getMessage());

        } catch (WrongPasswordException exception) {
            System.out.println(exception.getMessage());
        }


    }
}