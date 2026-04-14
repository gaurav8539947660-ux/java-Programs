class Shared {
    int data;
    boolean available = false;

    synchronized void produce(int val) throws Exception {
        while (available) wait();
        data = val;
        available = true;
        notify();
    }

    synchronized void consume() throws Exception {
        while (!available) wait();
        System.out.println("Consumed: " + data);
        available = false;
        notify();
    }
}

public class Q51_Producer_Consumer_Using_Wait_Notify {
    public static void main(String[] args) {
        Shared s = new Shared();

        new Thread(() -> {
            try { s.produce(10); } catch (Exception e) {}
        }).start();

        new Thread(() -> {
            try { s.consume(); } catch (Exception e) {}
        }).start();
    }
}