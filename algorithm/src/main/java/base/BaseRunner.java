package base;

public abstract class BaseRunner {

    void run(){
        long start = System.currentTimeMillis();
        onRun();
        long end = System.currentTimeMillis();
        System.out.println("time-Millis:"+(end-start));
    }
    protected abstract void onRun();
}
