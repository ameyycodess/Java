class Exc1 {
    static void subroutine() {
        int d = 0;
        try {
            int a = 10 / d;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }

    public static void main(String args[]) {
        Exc1.subroutine();
    }
}
