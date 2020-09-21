package test;

import java.util.*;

public class Test01 {
    public static void main(String[] args){
        int[] nums = new int[10];
        Arrays.fill(nums, 2);
        System.out.println(nums[2]);
        List<Integer> li = new ArrayList<>();
        List<List<Integer>> lli = new ArrayList<>();
        lli.add(li);
        li.add(2);
        lli.add(li);
        li.add(3);
        lli.add(li);
        System.out.println(lli);
        System.out.println(Integer.toBinaryString(3));
        System.out.println(0^4^4^6);
        System.out.println(1&4);
        System.out.println(5&4);
        

    }


    
}
