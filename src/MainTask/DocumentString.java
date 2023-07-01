package MainTask;

import MainTask.ContainsAbcException;

public class DocumentString {
    public static void showTwoDigitBlocks(String str) {
        System.out.println(str.substring(0,4) + str.substring(9,13));
    }

    //String str = "1234-abc-5678-efg-1a2b";

    public static void showWithReplacement(String str) {
        String replacement = "***";
        System.out.println(str.substring(0,5) + replacement + str.substring(8, 14) + replacement + str.substring(17));
    }

    public static void showOnlyLetters(String str) {
        String result = str.substring(5,8) + "/" + str.substring(14,17) + "/" + str.substring(19,20) + "/" + str.substring(21);
        System.out.println(result.toLowerCase());
    }

    public static void showOnlyLettersStringBuilder(String str) {
        StringBuilder result = new StringBuilder(str.substring(5,8) + "/" + str.substring(14,17) + "/" + str.substring(19,20) + "/" + str.substring(21));
        toUpperCase(result);
        System.out.println("Letters: " + result);
    }

    public static void toUpperCase(StringBuilder builder) {
        for (int i = 0; i < builder.length(); i++) {
            if (Character.isLowerCase(builder.charAt(i))) {
                builder.setCharAt(i,
                        Character.toUpperCase(builder.charAt(i)));
            }
        }
    }

    public static void containsABC(String str) throws ContainsAbcException {
        if (str.contains("abc") || str.contains("ABC")) {
            System.out.println("Номер документа содержит последовательность ABC.");
        } else {
            throw new ContainsAbcException("String doesn't contain ABC sequence!");
        }
    }

    public static void startsWith555(String str) throws StartsWith555Exception {
        if (str.substring(0,3).equals("555")) {
            System.out.println("Номер документа начинается с 555.");
        } else {
            throw new StartsWith555Exception("String doesn't start with 555!");
        }
    }

    public static void endsWith1a2b(String str) throws EndsWith1a2bException {
        if (str.substring(str.length() - 4).equals("1a2b")) {
            System.out.println("Номер документа заканчивается на 1a2b.");
        } else {
            throw new EndsWith1a2bException("String doesn't end with 1a2b!");
        }
    }


}

