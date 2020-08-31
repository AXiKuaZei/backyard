package designPatterns;

/**
 * 私有的静态内部类实现
 */
public class Singleton {

    private Singleton (){}  
    public static final Singleton getInstance() {  
        return SingletonHolder.INSTANCE;  
    } 

    private static class SingletonHolder {  
        private static final Singleton INSTANCE = new Singleton();  
    }  
}