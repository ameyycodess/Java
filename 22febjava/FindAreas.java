// Using run-time polymorphism.

class Figure {

    double dim1; // Corrected variable name from diml to dim1
    double dim2;

    Figure(double a, double b) {
        dim1 = a; // Corrected variable assignment
        dim2 = b;
    }

    double area() {
        System.out.println("Area for Figure is undefined.");
        return 0;
    }
}

class Rectangle extends Figure {

    Rectangle(double a, double b) {
        super(a, b);
    }

    // override area for rectangle
    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2; // Corrected variable name from diml to dim1
    }
}

class Triangle extends Figure {

    Triangle(double a, double b) {
        super(a, b);
    }

    // override area for right triangle
    double area() {
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2; // Corrected variable name from dim1 to dim1
    }
}

class FindAreas {

    public static void main(String args[]) {
        Figure f = new Figure(10, 10); // Added missing equal sign
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;

        figref = r;
        System.out.println("Area is " + figref.area());

        figref = t;
        System.out.println("Area is " + figref.area());

        figref = f;
        System.out.println("Area is " + figref.area());
    }
}