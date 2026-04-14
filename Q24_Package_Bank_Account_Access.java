class Account {
    protected double balance = 1000;
}

public class Q24_Package_Bank_Account_Access extends Account {
    public static void main(String[] args) {
        Q24_Package_Bank_Account_Access obj =
                new Q24_Package_Bank_Account_Access();

        System.out.println(obj.balance);
    }
}