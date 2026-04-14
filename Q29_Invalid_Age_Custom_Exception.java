class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

public class Q29_Invalid_Age_Custom_Exception {
    public static void main(String[] args) throws Exception {
        int age = 16;

        if (age < 18)
            throw new InvalidAgeException("Not eligible to vote");
        else
            System.out.println("Eligible to vote");
    }
}