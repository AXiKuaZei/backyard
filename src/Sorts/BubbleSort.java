package Sorts;

public class BubbleSort {
    public static void main(String[] args){
        int[] nums = {5,3,4,7,6,1,9,0,2,1,8};
        // int[] nums = {1,1,1,1,1,1,1,1,13,1,1,1};
        bubbleSort(nums);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }

    public static void bubbleSort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    SortUtils.swap(nums, j , j+1);
                }
            }
        }
    }
}
