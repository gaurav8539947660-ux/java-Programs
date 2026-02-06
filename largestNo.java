import java.util.Scanner;
public class largestNo {
    public static void main(String[] args) {
        int a, b, c, d, max;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        System.out.println("Largest number = " + max);
    }
}


