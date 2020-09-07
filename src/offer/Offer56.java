package offer;

/**
 * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。
 * 请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
 * 
 * 输入：nums = [1,2,10,4,1,4,3,3]
输出：[2,10] 或 [10,2]
 */
public class Offer56 {
    public static void main(String[] args){
        int[] nums = {1,10,4,1,4,3,3};
        // int[] ans = singleNumbers(nums);
        // for(int i:ans){
        //     System.out.println(i);
        // }
        int wwww=0;
        for(int i:nums){
            wwww^=i;
        }
        System.out.println(wwww);
        System.out.println(2>>1);
    }

    // public static int[] singleNumbers(int[] nums) {
    //     int[] ans;
    //     int temp =1;
    //     for(int i:nums){
    //         temp^=i;
    //     }
    //     return ans;
    // }
}
