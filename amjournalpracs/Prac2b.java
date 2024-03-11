

abstract class Clg {
    abstract void dept();

    void display() {
        System.out.println("College\n");
    }
}

class Science extends Clg {
    void dept() {
        System.out.println("Science department\n");
    }

    void display() {
        super.display(); 
        System.out.println("Science Department\n");
    }
}

class Commerce extends Clg {
    void dept() {
        System.out.println("Commerce department\n");
    }
    void display() {
        super.display(); 
        System.out.println("Commerce Department\n");
    }
}

public class Prac2b {
    public static void main(String[] args) {
        Science sci = new Science();
        Commerce comm = new Commerce();

        sci.dept();
        comm.dept();

        sci.display();
        comm.display();
    }
}
