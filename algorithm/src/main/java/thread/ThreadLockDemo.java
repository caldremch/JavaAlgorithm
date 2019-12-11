package thread;

public class ThreadLockDemo {
    public ThreadLockDemo() {
    }

    public static void main(String[] args) {
        S s = new S();
        System.out.println("main's address: " + s);
        changeValue(s);
        System.out.println("s'x = " + s.x);
    }

    public static void changeValue(S s) {
        System.out.println("fun's address: " + s);
        s.x = 3;
    }
}
