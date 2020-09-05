package Sorts;


public class FastSort {
    public static void main(String[] args){
        int[] nums = {5,3,4,7,6,1,9,0,2,1,8};
        // int[] nums = {1,1,1,1,1,1,1,1,13,1,1,1};
        fastSort(nums,0,nums.length-1);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
    
    public static void fastSort(int[] nums, int i, int j){
        if(i>=j){
            return;
        }
        int start = i+1;
        int end = j;
        while(start<end){
            while(start<=end && nums[start]<nums[i]){
                start++;
            }
            while(start<=end && nums[end]>nums[i]){
                end--;
            }
            if(start<end){
                SortUtils.swap(nums, start, end);
                start++;
                end--;
            }
        }
        SortUtils.swap(nums, i, end);
        fastSort(nums, i, end-1);
        fastSort(nums, end+1, j);
    }
}
