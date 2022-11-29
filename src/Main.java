public class Main {
    public static void main(String[] args) {
        final Bank bank = new Bank(1);
        Thread1 thread1 = new Thread1(bank);
        Thread2 thread2 = new Thread2(bank);

        Thread thread1Object = new Thread(thread1);
        Thread thread2Object = new Thread(thread2);

        thread1Object.start();
        thread2Object.start();

        try {
            thread1Object.join();
            thread2Object.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}