import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class VeryShadyLock  {
    private final Lock lock = new ReentrantLock();
    public volatile int x, y = 0;

    public void lock(int id) {
        int me = id;
        x = me;
        while (y != 0) {
            Thread.onSpinWait();
        };
        y = me;
        if (x != me) {
            System.out.println("sall");
            lock.lock();
        }
    }

    public void unlock() {
        y = 0;
        lock.unlock();
    }
}
