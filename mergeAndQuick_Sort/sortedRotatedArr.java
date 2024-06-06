package mergeAndQuick_Sort;
//33. Search in Rotated Sorted Array
public class sortedRotatedArr {
    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};
        int target=0;
        search(nums,target,0,nums.length-1);
        System.out.println(search(nums, target, 0,nums.length-1));
    }
    static int search(int[] nums, int target,int si,int ei) {
        if (si>ei) {
            return -1;
        }
        int mid=si+(ei-si)/2;
        //case found
        if (nums[mid]==target) {
            return mid;
        }
        //mid on line 1
        if (nums[si] <= nums[mid]) {
            //case a : left
            if (nums[si] <= target && target <= nums[mid]) {
                return search(nums, target, si, mid-1);
            }else{
                //case b: right
                return search(nums, target, mid+1, ei);
            }
        }
        //mid on line 2
        else{
            //case c: right
            if (nums[mid] <= target && target <= nums[ei]) {
                return search(nums, target, mid+1, ei);
            }else{
                //case d : left
                return search(nums, target, si, mid-1);
            }
        }
    }
}
