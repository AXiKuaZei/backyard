package offer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。 请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
 * 
 * 输入：nums = [1,2,10,4,1,4,3,3] 输出：[2,10] 或 [10,2]
 */
public class Offer56 {
    public static void main(String[] args){
        int[] nums = {1,10,4,1,4,3,3};
        // int[] ans = singleNumbers(nums);
        // for(int i:ans){
        //     System.out.println(i);
        // }
        int wwww=0;
        for(int i:singleNumbers(new int[]{1,2,5,2})){
            System.out.print(i+" ");
        }
        System.out.println(wwww);
        System.out.println(2>>1);
    }

    public static int[] singleNumbers(int[] nums) {
            int[][] memo = new int[nums.length][32];
            List<Integer> groupA;
            List<Integer> groupB;
            HashSet<Integer> groupC = new HashSet<>();
            int joler = 1;
            while(true){
                groupA = new ArrayList<Integer>();
                groupB = new ArrayList<Integer>();
                for(int intt:nums){
                    if(groupC.contains(intt)) continue;
                    if((intt&joler)==joler){
                        groupA.add(intt);
                    }else{
                        groupB.add(intt);
                    }
                }
                int ansa = 0;
                for(int intt:groupA){
                    ansa^=intt;
                }
                int ansb = 0;
                for(int intt:groupB){
                    ansb^=intt;
                }
                if(ansa==0){
                    joler = joler<<1;
                    for(int i:groupB){
                        groupC.add(i);
                    }
                }else if(ansb==0){
                    joler = joler<<1;
                    for(int i:groupA){
                        groupC.add(i);
                    }
                }else{
                    return new int[]{ansa, ansb};
                }
            }
    
        }
}
