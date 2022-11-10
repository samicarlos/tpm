package com;

public class Peterson {
    int n=10;
    int level[] = new int[n];
    int victim[] = new int[n];
 //   int contor[] = new int[n];

    boolean exists(int i, int[] level, int L)
    {
        for(int j=0;j<ThreadId.get();j++) {
            if(j==i && level[j]>=L)
                return true;
        }
        return false;
    }
//    boolean contorIsNotMin(int[] contor, int c){
//        for(int i=0;i<n;i++){
//            if(contor[i]<c)
//                return true;
//        }
//        return false;
//    }
    void lock() {
        for (int L = 1; L < n; L++) {
            level[ThreadId.get()] = L;
            victim[L] = ThreadId.get();
            while (( exists(ThreadId.get(), level, L)) && victim [L] == ThreadId.get() ) {};
        }
    }

    void unlock() {
        level[ThreadId.get()] = 0;
  //      contor[ThreadId.get()]++;
    }
}
