class InsufficientFundsException extends Exception {
    InsufficientFundsException(String msg) {
        super(msg);
    }
}

class BankAccount {
    double balance = 500;

    void withdraw(double amt) throws InsufficientFundsException {
        if (amt > balance)
            throw new InsufficientFundsException("Not enough balance");

        balance -= amt;
        System.out.println("Withdrawn: " + amt);
    }
}

public class Q36_Bank_Account_With_Insufficient_Funds_Exception {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        try {
            acc.withdraw(1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}