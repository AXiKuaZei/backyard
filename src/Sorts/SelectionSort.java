package Sorts;

public class SelectionSort {
    public static void main(String[] args){
        int[] nums = {5,3,4,7,6,1,9,0,2,1,8};
        // int[] nums = {1,1,1,1,1,1,1,1,13,1,1,1};
        selectionSort(nums);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }

    public static void selectionSort(int[] nums){
        for(int i=1;i<nums.length;i++){
            int temp = nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>temp){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = temp;
        }
    }
}
