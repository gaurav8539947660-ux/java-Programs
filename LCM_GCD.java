import java.util.Scanner;

class LCM_GCD {
    public static void main(String[] args) {
        int a, b, x, y, gcd, lcm;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        x = a;
        y = b;

        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        gcd = x;
        lcm = (a * b) / gcd;

        System.out.println("GCD = " + gcd);
        System.out.println("HCF = " + gcd);
        System.out.println("LCM = " + lcm);
    }
}
