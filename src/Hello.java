import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Hello {
    public static void main(String[] args)
            throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
            NoSuchMethodException, SecurityException, ClassNotFoundException {
        System.out.println("hello");
        List<List<Integer>> li = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        li.add(a);
        String an =  (String) Class.forName("java.lang.String")
                        .getDeclaredConstructor(String.class).newInstance("fff");
        System.out.println(an);

    }


}