package offer;

/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，
 * 则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。
 * 
 * 输入: [7,5,6,4]    输出: 5
 */
public class Offer51 {
    public static void main(String[] args){
        int[] nums = {7,5,6,4};
        System.out.println(reversePairs(nums));
    }

    //超时啦！！！
    public static int reversePairs(int[] nums) {
        return reversePairs(nums, 0);
    }

    public static int reversePairs(int[] nums, int index) {
        int count =0;
        if(index>=nums.length-1){
            return count;
        }
        for(int i=index+1;i<nums.length;i++){
            if(nums[index]>nums[i]){
                count++;
            }
        }
        return count+reversePairs(nums,index+1);
    }
}
