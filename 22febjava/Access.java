class A {
    int i; // public by default
    private int j; // private to A

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}

// A's j is not accessible here.
class B extends A {
    int total;

    void sum() {
        // ERROR: j is not accessible here
        // To fix this, you should either make j protected or use the setij method in class A.
        // total = i + j;
    }
}

class Access {
    public static void main(String args[]) {
        B subob = new B();
        subob.setij(10, 12);
        subob.sum();

        // Move the print statement inside the main method
        System.out.println("Total is: " + subob.total);
    }
}
