class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

public class Q21_Constructor_Chaining_Using_Super extends Parent {

    Q21_Constructor_Chaining_Using_Super() {
        super();
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        new Q21_Constructor_Chaining_Using_Super();
    }
}