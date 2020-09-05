package Sorts;

import java.util.PriorityQueue;

public class HeapSort {
    public static void main(String[] args){
        int[] nums = {5,3,4,7,6,1,9,0,2,1,8};
        // int[] nums = {1,1,1,1,1,1,1,1,13,1,1,1};
        heapSort2(nums);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }

    // use java api
    public static void heapSort(int[] nums){
        PriorityQueue<Integer> pq = new PriorityQueue<>(nums.length);
        for(int i:nums){
            pq.add(i);
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = pq.poll();
        }
    }

    //
    public static void heapSort2(int[] nums){
        int len = nums.length-1;
        for(int i=len/2;i>=0;i--){
            heapify(nums, i, len);
        }
        while(len>0){
            SortUtils.swap(nums, 0, len--);
            heapify(nums, 0, len);
        }
    }


    public static void heapify(int[] nums, int index, int len){
        int left = index*2+1;
        int right = left+1;
        if(left>len){
            return;
        }
        if(right>len){
            if(nums[left]>nums[index]){
                SortUtils.swap(nums, left, index);
                heapify(nums, left, len);
            }
            return;
        }        
        if(nums[left]>nums[index] || nums[right]>nums[index]){
            if(nums[left]>nums[right]){
                SortUtils.swap(nums, left, index);
                heapify(nums, left, len);
            }else{
                SortUtils.swap(nums, right, index);
                heapify(nums, right, len);
            }
        }

    }
}
