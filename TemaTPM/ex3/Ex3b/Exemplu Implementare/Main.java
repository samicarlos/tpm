

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int n = 10;
        VeryShadyLock lock = new VeryShadyLock();
        ThreadA thrd1 = new ThreadA(1, lock);
        ThreadA thrd2 = new ThreadA(2, lock);
        ThreadA thrd3 = new ThreadA(3, lock);
        ThreadA thrd4 = new ThreadA(4, lock);
        ThreadA thrd5 = new ThreadA(5, lock);
        ThreadA thrd6 = new ThreadA(6, lock);
        ThreadA thrd7 = new ThreadA(7, lock);
        ThreadA thrd8 = new ThreadA(8, lock);
        ThreadA thrd9 = new ThreadA(9, lock);
        ThreadA thrd10 = new ThreadA(10, lock);


        thrd1.start();
        thrd2.start();
        thrd3.start();
        thrd4.start();
        thrd5.start();
        thrd6.start();
        thrd7.start();
        thrd8.start();
        thrd9.start();
        thrd10.start();


        thrd1.join();
        thrd2.join();
        thrd3.join();
        thrd4.join();
        thrd5.join();
        thrd6.join();
        thrd7.join();
        thrd8.join();
        thrd9.join();
        thrd10.join();

        System.out.println(sharedObj.cnt);
    }
}
