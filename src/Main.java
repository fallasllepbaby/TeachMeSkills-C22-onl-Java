
public class Main {
    public static void main(String[] args) {

    }

    // Main task

    // Task 1

    public static boolean hasAbc(String str) throws AbcIncludesException {
        if (str.contains("abc") || str.contains("ABC")) {
            return true;
        } else {
            throw new AbcIncludesException("String doesn't contain abc sequence!");
        }
    }
}