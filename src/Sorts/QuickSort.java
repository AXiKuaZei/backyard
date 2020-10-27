package Sorts;

/**
 * @author axikuazei
 * @date 2020/10/27 上午9:47
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] nums = new int[]{5,4,6,7,2,1,9,0,4,3,8};
        quickSort(nums);
        for(int i:nums){
            System.out.print(i + " ");
        }
    }

    public static void partition(int[] nums, int low, int high){
        if(low>=high) return;
        int curr = nums[low];
        int i=low+1;
        int j=high;
        while(i<=j){
            while(i<=j && nums[i]<curr){
                i++;
            }
            while(i<=j && nums[j]>curr){
                j--;
            }
            // 4  3 5
            //    i j
            if(i<=j){
                int temp =nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
        }
        int temp =nums[low];
        nums[low]=nums[j];
        nums[j]=temp;
        partition(nums, low,j-1);
        partition(nums, j+1,high);

    }

    public static void quickSort(int[] nums){
       partition(nums, 0, nums.length-1);
    }
}
