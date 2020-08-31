package ClassLoader;

public class InnerClassTest02 {
    public static void main(final String[] args) {
        InnerClassTest innerClassTest = new InnerClassTest();
        //在外部实例化：
        //普通内部类：需要依托外部类实例
        innerClassTest.new InnerA();
        //静态内部类：不需要外部类实例，通过 new Outclass.InnerClass()
        new InnerClassTest.InnerC();
    }
    
}