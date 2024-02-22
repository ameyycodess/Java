class Box {

    double width;
    double height;
    double depth;

    // Construct a clone of an object
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Constructor used when all dimensions specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Constructor used when no dimensions specified
    Box() {
        width = -1; // Use -1 to indicate an uninitialized box
        height = -1;
        depth = -1;
    }

    // Constructor used when a cube is created
    Box(double len) {
        width = height = depth = len;
    }

    // Compute and return the volume
    double volume() {
        return width * height * depth;
    }
}

// Here, Box is extended to include weight.
class BoxWeight extends Box {
    double weight; // Weight of the box

    // Constructor for BoxWeight
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // Call the superclass constructor
        weight = m;
    }
}

class DemoBoxWeight {
    public static void main(String args[]) {

        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);

        double vol;

        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is: " + vol);
        System.out.println("Weight of myBox1 is: " + myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Volume of myBox2 is: " + vol);
        System.out.println("Weight of myBox2 is: " + myBox2.weight);
    }
}
