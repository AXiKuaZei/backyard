package ClassLoader;

public class InnerClassTest {
    public class InnerA{
        private static final String a = "A";
    }
    private class InnerB{
        private String a = "A";
    }

    public static class InnerC{
        private static String a = "A";
    }

    private static class InnerD{
        private static String a = "A";
    }

    public static void main(String[] args){
        InnerClassTest innerClassTest = new InnerClassTest();
        innerClassTest.new InnerA();
        System.out.println(InnerA.a);
        System.out.println(innerClassTest.new InnerB().a);
        System.out.println(InnerC.a);
        System.out.println(InnerD.a);
    }
}