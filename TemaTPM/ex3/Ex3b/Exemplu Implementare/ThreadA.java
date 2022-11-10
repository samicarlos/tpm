public class ThreadA extends  Thread{
    VeryShadyLock lock;
    int incrementari;

    int id;

    ThreadA(int id, VeryShadyLock lock){
        this.id = id;
        this.lock = lock;
    }


    public void run(){
        lock.lock(id);
        try{
            int cnt = 100000;

            while(cnt>0){
                sharedObj.cnt++;
                cnt--;
            }
        }
        finally {
            lock.unlock();
        }
    }

}
