import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Salbatic extends Thread {
    int idSalbatic;
    int serviri = 0;
    ReentrantLock lock;
    Bucatar bucatar;

    Salbatic(int idSalbatic, ReentrantLock lacat, Bucatar bucatar) {
        this.idSalbatic = idSalbatic;
        this.lock = lacat;
        this.bucatar = bucatar;
    }


    public void run() {
        lock.lock();
        try {
            if (Bucatar.oala == 0)  { // oala este goala si ordonam bucaturului reumplerea acesteia
                bucatar.umplere(); //umplem oala
                Bucatar.oala--;
                //serviri++;
            } else {
                //serviri++;
                Bucatar.oala--; //salbaticul isi ia portia
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock(); //deblocam lacatul
        }

    }


}
