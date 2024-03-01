public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread( new Counter(40, "Counter Name 1") );
        Thread thread2 = new Thread( new Counter(50, "Counter Name 2") );
        Thread thread3 = new Thread( new Counter(20, "Counter Name 3") );
        Thread thread4 = new Thread( new Counter(70, "Counter Name 4") );

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            thread4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}