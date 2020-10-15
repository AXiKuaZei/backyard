package test;

import java.util.Hashtable;

public class Te {
    public static void main(String[] args){
        Hashtable ht = new Hashtable();
        Object x = new Object();
        ht.put(x,1);
        x = new Object();
        ht.put(x,2);
        System.out.println(ht.size());
        System.out.println(ht);
    }


}
