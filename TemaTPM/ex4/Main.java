import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int n;
        Bucatar bucatar = new Bucatar();
        Scanner scanner = new Scanner(System.in);


        System.out.println(" Introduceti numarul de salbatici: ");
        n = scanner.nextInt(); //numarul de salbatici


        System.out.println(" Introduceti capacitatea oalei: ");
        Bucatar.capacitate = scanner.nextInt();

        Bucatar.oala = Bucatar.capacitate; //oala de unde se vor hrani salbaticii
        ReentrantLock lock = new ReentrantLock(); //lacatul thread-urilor
        Salbatic[] thrd = new Salbatic[n]; //cei n salbatici

        for (int i = 0; i < n; i++) {
            thrd[i] = new Salbatic(i, lock, bucatar); //Initializam fiecare salbatic cu i care va fi id-ul lor unic si lacatul partajat
            thrd[i].start(); //lansam in executie thread-ul
        }

        for(int i = 0; i < n; i ++)
            thrd[i].join();
        //for(int i = 0; i < n; i++)
            //System.out.println(thrd[i].serviri);
        //System.out.println(Bucatar.oala + "  " + Bucatar.umpleri);
    }
}
