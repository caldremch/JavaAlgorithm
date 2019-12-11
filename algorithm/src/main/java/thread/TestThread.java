package thread;

public class TestThread extends Thread {
    static int j = 0;

    public TestThread() {
    }

    public static synchronized void testA() {
        ++j;
        System.out.println(Thread.currentThread().getName() + ": " + j);
    }

    public synchronized void testB() {
        ++j;
        System.out.println(Thread.currentThread().getName() + ": " + j);
    }

    public void run() {
    }
}
