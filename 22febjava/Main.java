// Base class A
class A {
    String name;

    public A(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Class A: " + name);
    }
}

// Derived class B inheriting from A
class B extends A {
    public B(String name) {
        super(name);
    }

    // Method overloading in class B
    public void display(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Class B: " + name);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an instance of class A
        A objA = new A("ObjectA");
        objA.display();

        // Creating an instance of class B
        B objB = new B("ObjectB");
        objB.display();
        objB.display(4);
    }
}
