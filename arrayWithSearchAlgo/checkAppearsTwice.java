package arrayWithSearchAlgo;

import java.util.HashSet;

public class checkAppearsTwice {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        //System.out.println(check(nums));
        System.out.println(checkInHashset(nums));

    }
    static boolean check(int[] nums){
        int add=0;
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[add]==nums[i+1]) {
                return true;
            }
        }
        add++;
        return false;
    }
    //hashset mehtod
    static boolean checkInHashset(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}
