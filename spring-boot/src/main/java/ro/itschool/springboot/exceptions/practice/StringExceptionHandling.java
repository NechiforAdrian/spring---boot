package ro.itschool.springboot.exceptions.practice;

public class StringExceptionHandling {

    public static void main(String[] args) {
        String sampleText = "Hello world.";
        int validIndex = 3;
        int invalidIndex = 20;

 //       printCharAt(sampleText, validIndex);
        printCharAt(sampleText, invalidIndex);

    }

    private static void printCharAt(String text, int index) {
        try {
            System.out.println("Character at index " + index + ": " + text.charAt(index));
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
            System.out.println("Invalid index. Index must be between 0 and " + (text.length() - 1));
        }

    }
}

