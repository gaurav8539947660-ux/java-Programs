import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        double p, r, t, ci;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        p = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        r = sc.nextDouble();

        System.out.print("Enter Time (years): ");
        t = sc.nextDouble();

        ci = p * Math.pow((1 + r / 100), t) - p;

        System.out.println("Compound Interest = " + ci);
    }
}
