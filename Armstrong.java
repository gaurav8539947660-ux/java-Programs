class Armstrong {
    public static void main(String[] args) {
        int num = 153, sum = 0, digit, temp;

        temp = num;

        while (num > 0) {
            digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }

        if (sum == temp)
            System.out.println("153 is an Armstrong number");
        else
            System.out.println("153 is not an Armstrong number");
    }
}
