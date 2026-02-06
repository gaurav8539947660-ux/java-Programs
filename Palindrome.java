class Palindrome {
    public static void main(String[] args) {
        int num = 353, rev = 0, temp;

        temp = num;

        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num = num / 10;
        }

        if (rev == temp)
            System.out.println("353 is a Palindrome number");
        else
            System.out.println("353 is not a Palindrome number");
    }
}
