import java.util.Scanner;

public class UserDefinedException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password: ");

        try {
            int password = scanner.nextInt();
            if (password > 5) {
                throw new MyException("Password must not be greater than 5");
            }
        } catch (MyException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }
}
