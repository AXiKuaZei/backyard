package designPatterns;


/**
 * 双检锁实现单例模式
 */
public class Singleton02 {  
    private volatile static Singleton02 singleton;  
    private Singleton02 (){}  
    public static Singleton02 getSingleton() {  
        if (singleton == null) {  
            synchronized (Singleton02.class) {  
            if (singleton == null) {  
                singleton = new Singleton02();  
            }  
            }  
        }  
        return singleton;  
    }  
}