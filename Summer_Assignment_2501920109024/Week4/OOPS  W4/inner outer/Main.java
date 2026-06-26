class Outer {

    void display() {
        System.out.println("Display Method of Outer Class");
    }

    class Inner {

        void display() {
            System.out.println("Display Method of Inner Class");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.display();

        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}