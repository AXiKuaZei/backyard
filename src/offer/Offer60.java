package offer;

import java.util.*;

public class Offer60{
    public static void main(String[] args){
        for(double d:twoSum(2)){
            System.out.print(d+" ");
        }
        System.out.println(twoSum(5).length);
    }

    public static double[] twoSum(int n) {
        Map<Integer, Double> map = new HashMap<>();
        map.put(1, 1./6);
        map.put(2, 1./6);
        map.put(3, 1./6);
        map.put(4, 1./6);
        map.put(5, 1./6);
        map.put(6, 1./6);
        while(n>1){
            Map<Integer, Double> hm = new HashMap<>();
            for(Map.Entry entry:map.entrySet()){
                int key = (int) entry.getKey();
                double value = (double) entry.getValue();
                System.out.println(key+":"+value);
                for(int i=1;i<=6;i++){
                    if(hm.containsKey(key+i)){
                        hm.put(key+i, hm.get(key+i)+value/6);
                    }else{
                        hm.put(key+i, value/6);
                    }
                }
            }
            map = hm;
            n--;
        }
        double[] ans = new double[map.size()];
        int index=0;
        for(Map.Entry entry:map.entrySet()){
            ans[index++] = (double) entry.getValue();
        }

        return ans;
    }
}