package concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintByTurnLock {
    public static void main(String[] args) {
        Print pa = new Print("a", 0);
        Print pb = new Print("b", 1);
        Print pc = new Print("c", 2);
        new Thread(pa).start();
        new Thread(pb).start();
        new Thread(pc).start();
    }

    private static class Print implements Runnable {

        String s;

        static int i = 0;

        int threadID;

        static Lock lock = new ReentrantLock();

        @Override
        public void run() {
            // TODO Auto-generated method stub

            while(true){
                try {
                    lock.lock();
                    if(i%3==threadID){
                        Thread.sleep(1000);
                        System.out.println(s);
                        i++;
                    }
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }finally{
                    lock.unlock();
                }
            }
        }

        private Print(String s, int threadID){
            this.s = s;
            this.threadID = threadID;
        }

    }
}
