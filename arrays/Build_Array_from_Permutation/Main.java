package arrays.Build_Array_from_Permutation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] result = solution.buildArray(nums);
        
        System.out.println(Arrays.toString(result));
    }
}
