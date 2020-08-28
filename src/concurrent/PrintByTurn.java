package concurrent;

import java.util.concurrent.Semaphore;

public class PrintByTurn {

    public static void main(String[] args) {
        Semaphore a = new Semaphore(1);
        Semaphore b = new Semaphore(0);
        Semaphore c = new Semaphore(0);
        Thread t1 = new Thread(new Inner("a", a, b), "Thread-1");
        Thread t2 = new Thread(new Inner("b", b, c), "Thread-2");
        Thread t3 = new Thread(new Inner("c", c, a), "Thread-3");
        t1.start();
        t2.start();
        t3.start();
    }

    public static class Inner implements Runnable {

        private String msg;

        private Semaphore lock;

        private Semaphore nextLock;

        public Inner(String msg, Semaphore lock, Semaphore nextLock) {
            this.msg = msg;
            this.lock = lock;
            this.nextLock = nextLock;
        }

        @Override
        public void run() {
            while(true){
                try {
                    lock.acquire();
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + "------>" + msg);
                    nextLock.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}