class EvenFibonacciSum {
    public static void main(String[] args) {
        int a = 0, b = 1, c, sum = 0;

        while (a <= 25) {
            if (a % 2 == 0)
                sum += a;

            c = a + b;
            a = b;
            b = c;
        }

        System.out.println("Sum of even Fibonacci numbers up to 25 = " + sum);
    }
}

