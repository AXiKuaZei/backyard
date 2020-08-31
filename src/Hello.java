import java.util.ArrayList;
import java.util.HashSet;

public class Hello {
    public static void main(String[] args){
        System.out.println("hello world");
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        System.out.println(new ArrayList<>(hashSet));
    }
}