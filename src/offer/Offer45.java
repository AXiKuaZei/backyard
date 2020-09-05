package offer;

import java.util.Arrays;

/**
 * 输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。

输入: [10,2]
输出: "102"
示例 2:

输入: [3,30,34,5,9]
输出: "3033459"

 */
public class Offer45 {
    public static void main(String[] args){
        int[] nums = {3,30,34,5,9}; 
        fastSort(nums,0,nums.length-1);
        for(int i:nums) System.out.print(i);
        // System.out.println(minNumber(nums));
    }

    public static String minNumber(int[] nums) {
        StringBuilder sb = new StringBuilder();
        Integer[] numss = new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            numss[i] = nums[i];
        }
        Arrays.sort(numss, (a, b)->{
            long temp = Long.parseLong(String.valueOf(a)+String.valueOf(b))-Long.parseLong(String.valueOf(b)+String.valueOf(a));
            return temp>0?1:temp==0?0:-1;
        });
        for(int i:numss){
            sb.append(i);
        }
        return sb.toString();
    }

    private static void fastSort(int[] nums, int left, int right){
        if(left>right){
            return;
        }
        int i=left+1;
        int j=right;
        while(i<j){
            while(compare(nums[i],nums[left])<0){
                i++;
            }
            while(compare(nums[left],nums[j])<0){
                j--;
            }
            if(i>j){
                break;
            }
            swap(nums, i, j);
            i++;
            j--;
        }
        swap(nums, left, j);
        fastSort(nums,left,j-1);
        fastSort(nums,j+1,right);
    }

    private static void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    private static int compare(int a, int b){
        long temp = Long.parseLong(String.valueOf(a)+String.valueOf(b))-Long.parseLong(String.valueOf(b)+String.valueOf(a));
            return temp>0?1:temp==0?0:-1;
    }
}
