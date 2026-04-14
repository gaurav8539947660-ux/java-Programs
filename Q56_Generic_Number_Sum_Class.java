class Calculator<T extends Number> {
    double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
}

public class Q56_Generic_Number_Sum_Class {
    public static void main(String[] args) {
        Calculator<Integer> c = new Calculator<>();
        System.out.println(c.add(10, 20));
    }
}