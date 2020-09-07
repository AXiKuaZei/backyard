package offer;


/**
 * 

输入: nums = [5,7,7,8,8,10], target = 8
输出: 2
示例 2:

输入: nums = [5,7,7,8,8,10], target = 6
输出: 0

 */
public class Offer53 {
    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,10};
        System.out.println(search(nums, 8));
    }


    public static int search(int[] nums, int target) {
        if(nums.length==0) return 0;
        int low = 0;
        int high = nums.length-1;
        int mid = (low+high)/2;
        while(true){
            if(nums[mid]==target){
                break;
            }else if(nums[mid]<target){
                low = mid + 1;
            }else if(nums[mid]>target){
                high = mid - 1;
            }
            if(low>high){
                return 0;
            }
            mid = (low+high)/2;
        }
        low = mid-1;
        high = mid+1;
        int count=1;
        while(low>=0 && nums[low--]==target){
            count++;
        }
        while(high<nums.length && nums[high++]==target){
            count++;
        }
        return count;
    }
}
