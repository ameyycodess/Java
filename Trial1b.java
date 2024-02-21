public class Trial1b {

    
    public int add(int a, int b) {
        return a + b;
    }

    
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Trial1b calculator = new Trial1b();

        
        int x = calculator.add(2, 3);
        int y = calculator.add(1, 4, 6);
        double z = calculator.add(2.5, 3.5);

        System.out.println("Result 1: " + x);
        System.out.println("Result 2: " + y);
        System.out.println("Result 3: " + z);
    }
}
