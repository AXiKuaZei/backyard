package concurrent;

import java.util.concurrent.locks.*;

public class BoundedBuffer {
    private final Lock lock = new ReentrantLock();
    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();
    private int product = 0;
    private final int max = 10;

    public void get() {
        try {
            lock.lock();
            while(product < 1) {
                notEmpty.await();
            }
            product--;
            notFull.signalAll();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }

    public void release(){
        try{
            lock.lock();
            while(product==max){
                notFull.await();
            }
            product++;
            notEmpty.signalAll();
        }catch(InterruptedException e){
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }

    public static void main(String[] args){
        BoundedBuffer bf = new BoundedBuffer();
            new Thread(()->{
                for(int i=0;i<10;i++){
                    bf.get();
                    System.out.println("释放一个，还剩"+bf.product+"个");
                }
            },"生产者").start();
            new Thread(()->{
                for(int i=0;i<10;i++){
                    bf.release();
                    System.out.println("消费一个，还剩"+bf.product+"个");
                }
            },"消费者").start();
    }
}
