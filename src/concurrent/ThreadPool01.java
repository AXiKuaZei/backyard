package concurrent;

public class ThreadPool01 {

    static int y =2;

    public static void main(String[] args){
        int x = 1;

        Runnable r1 = new Runnable(){
            int z = 3;
            @Override
            public void run(){
                System.out.println(x);
                System.out.println(y);
                System.out.println(z++);
            }

        };
        Thread a = new Thread(r1);
        Thread b = new Thread(r1);
        a.start();
        b.start();

        
    }
}