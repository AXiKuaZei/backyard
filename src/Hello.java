import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Hello {
    public static void main(String[] args){
        System.out.println("hello world");
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        System.out.println(new ArrayList<>(hashSet));
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(15,(a, b)->{
           return a>b ? -1 : a==b ? 0:1;
        });
        pq.add(15);
        pq.add(14);
        pq.add(16);
        System.out.println(pq.peek());
    }
}