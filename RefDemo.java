class RefDemo {

    public static void main(String args[]) {

        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);

        Box plainBox = new Box();

        double vol;

        vol = weightBox.volume();
        System.out.println("Volume of weightBox is " + vol);
        System.out.println("Weight of weightBox is " + weightBox.weight);

        System.out.println();

        // Assign BoxWeight reference to Box reference
        plainBox = weightBox;

        vol = plainBox.volume(); // OK, volume() defined in Box
        System.out.println("Volume of plainBox is " + vol);

        /* The following statement is invalid because plainBox does not define a weight member. */
        // System.out.println("Weight of plainBox is " + plainBox.weight);
    }
}
