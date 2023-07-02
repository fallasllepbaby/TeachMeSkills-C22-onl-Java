package AdditionalTask;
import java.io.*;

public class LoginPassword {
    public static boolean checkLoginAndPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException{
        if (login.length() > 19 || login.contains(" ")) {
            throw new WrongLoginException("Wrong login!");
        }
        if (password.length() > 19 || password.contains(" ") || !(password.matches(".*\\d.*")) || !(password.equals(confirmPassword))) {
            throw new WrongPasswordException("Wrong password!");
        }

        return true;
    }
}
