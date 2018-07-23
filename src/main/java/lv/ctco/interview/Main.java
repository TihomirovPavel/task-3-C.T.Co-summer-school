package main.java.lv.ctco.interview;

public class Main {

    public static void main(String[] args) {
        String input = "{({})[}";
        checkForBalance(input);
        input = "{{)(}}";
        checkForBalance(input);
        input = "{()}[[{}]]";
        checkForBalance(input);
    }

    private static void checkForBalance(String input) {
        String result = removeCloseablePairs(input);
        if (result.length() == 0) {
            System.out.println("the Input: " + input + " is Balanced");
        } else {
            System.out.println("the Input: " + input + " is Not Balanced");
            System.out.println("can not close " + result);
        }
    }

    public static String removeCloseablePairs(String input) {
        int size;
        do {
            size = input.length();
            input = input.replace("()", "")
                    .replace("[]", "")
                    .replace("{}", "");
        } while (size > input.length());
        return input;
    }
}
