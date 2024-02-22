class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // This is an inner class
    class Inner {
        int y = 10; // y is local to Inner

        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }

    void showy() {
        // Accessing y from the Inner class
	System.out.println(y);
        //System.out.println("showy: y = " + new Inner().y);
    }
}

public class InnerClassDemo2 {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
        //outer.showy(); // Corrected the placement of this line
    }
}
