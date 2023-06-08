package arina_tolchenitsyna.second_java_task.string_main;

public class StringMain {
    public static void main(String[] args) {
        String taskString = "Hello weebs!";
        int taskStringLength = taskString.length();
        System.out.println("The length of the string is " + taskStringLength);

        String upperCase = taskString.toUpperCase();
        System.out.println("The upper case of the string is " + upperCase);

        boolean contains = taskString.contains("weebs");
        System.out.println("This string contains the word 'weebs': " + contains);

        String whiteSpace = "   uwu  ";
        System.out.println(whiteSpace);
        String whiteSpaceRemoved = whiteSpace.strip();
        System.out.println(whiteSpaceRemoved);

        String substring = "Hello weebs!".substring(0, 5);
        System.out.println(substring);
    }
}
