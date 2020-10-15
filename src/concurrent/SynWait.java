package concurrent;

/**
 * @author axikuazei
 * @date 2020/10/14 下午1:40
 */
public class SynWait {
    public static void main(String[] args) {
        Object o = new Object();
        new Thread(()->{
            synchronized (o){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("wait before");
                try {
                    o.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("wait after");
            }
        }).start();
        new Thread(()->{

            synchronized (o){
                System.out.println("notify before");
                o.notify();
                System.out.println("notify after");
            }
        }).start();

    }
}
