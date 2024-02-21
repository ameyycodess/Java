public class StaticMethodsExample {
    
    // Static method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Static method to multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Static method to concatenate two strings
    public static String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        
        int sumResult = StaticMethodsExample.add(5, 3);

        int multiplyResult = StaticMethodsExample.multiply(4, 6);

        String concatenatedString = StaticMethodsExample.concatenateStrings("Hello", "World");

        System.out.println("Sum Result: " + sumResult);

        System.out.println("Multiply Result: " + multiplyResult);

        System.out.println("Concatenated String: " + concatenatedString);
    }
}
