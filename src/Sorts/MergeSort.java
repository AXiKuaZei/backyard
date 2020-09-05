package Sorts;

public class MergeSort {

    public static void main(String[] args){
        int[] nums = {5,3,4,7,6,1,9,0,2,1,8};
        // int[] nums = {1,1,1,1,1,1,1,1,13,1,1,1};
        mergeSort(nums, 0, nums.length-1);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }

    public static void mergeSort(int[] nums, int start ,int end){
        if(end<=start){
            return;
        }else if(end - start ==1){
            if(nums[end]<nums[start]){
                SortUtils.swap(nums, start, end);
            }
        }else{
            mergeSort(nums, start, (start+end)/2);
            mergeSort(nums, (start+end)/2+1, end);
            int[] temp = new int[end-start+1];
            int i = start;
            int j = (start+end)/2+1;
            for(int k=0;k<temp.length;){
                temp[k++] = nums[i]<=nums[j]?nums[i++]:nums[j++];
                if(i>(start+end)/2){
                    while(k<temp.length){
                        temp[k++] = nums[j++];
                    }
                }else if(j>end){
                    while(k<temp.length){
                        temp[k++] = nums[i++];
                    }
                }
            }
            for(int m=start,k=0;m<=end;m++){
                nums[m] = temp[k++];
            }
        }
    }
}
