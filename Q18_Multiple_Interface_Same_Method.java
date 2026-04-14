interface I1 {
    default void show() {
        System.out.println("I1");
    }
}

interface I2 {
    default void show() {
        System.out.println("I2");
    }
}

public class Q18_Multiple_Interface_Same_Method implements I1, I2 {
    public void show() {
        I1.super.show();
    }

    public static void main(String[] args) {
        new Q18_Multiple_Interface_Same_Method().show();
    }
}