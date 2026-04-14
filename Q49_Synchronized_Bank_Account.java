class Bank {
    int balance = 1000;

    synchronized void withdraw(int amt) {
        if (balance >= amt) {
            balance -= amt;
            System.out.println("Withdraw: " + amt);
        }
    }
}

public class Q49_Synchronized_Bank_Account {
    public static void main(String[] args) {
        Bank b = new Bank();

        Runnable r = () -> b.withdraw(500);

        new Thread(r).start();
        new Thread(r).start();
    }
}