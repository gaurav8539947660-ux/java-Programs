import java.util.Scanner;

class AddTwoNumbers {
    public static void main(String[] args) {
        int a, b, sum;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        sum = a + b;

        System.out.println("Sum = " + sum);
    }
}
