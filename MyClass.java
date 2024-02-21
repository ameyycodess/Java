public class MyClass {
    private int value;

    // Default Constructor
    public MyClass() {
        this.value = 0;
    }

    // Overloaded Constructor
    public MyClass(int initial_value) {
        this.value = initial_value;
    }

    // Copy Constructor
    public MyClass(MyClass otherInstance) {
        this.value = otherInstance.value;
    }

    // Getter method for value
    public int getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        // Default Constructor
        MyClass objDefault = new MyClass();

        // Overloaded Constructor
        MyClass objOverloaded = new MyClass(42);

        // Copy Constructor
        MyClass objCopy = new MyClass(objOverloaded);

        // Example usage
        System.out.println("Default Constructor Value: " + objDefault.getValue());
        System.out.println("Overloaded Constructor Value: " + objOverloaded.getValue());
        System.out.println("Copy Constructor Value: " + objCopy.getValue());
    }
}
