/*
    Write the JML specification knowing that:
    - nums doesn't contain duplicates
    - highs length is equal to n
    - method finds the n greater numbers in nums and inserts them into highs in decreasing order
    - nums doesn't change
*/
public class FindGreaterNumbers {

    //@ requires nums != null
    //@     && highs != null
    //@     && n >= 0
    //@     && (\forall int i; i >= 0 && i <= (nums.length - 1); 
    //@             (\forall int j; j >= i && j <= nums.length; nums[i] != nums[j]));
    //@ ensures (\forall int i; i >= 0 && i <= nums.length; \old(nums[i]) == nums[i])
    //@     && nums.length == \old(nums)-length
    //@     && (\forall int i; i >= 0 && i <= highs.length; (\exists int j; j >= 0 && j <= nums.length; highs[i] == nums[j]))
    //@     && (\forall int i; i >= 0 && i <= (highs.length - 1); highs[i] > highs[i+1])
    //@     && (\forall int i; i >= 0 && i<= highs.length; 
    //@             (\forall int j; j >= 0 && j <= nums.length; 
    //@                 (highs[i] >= nums[j]) || (\exists k; k >= 0 && k <= i; nums[j] == highs[k])))
    //@     && highs.length == n;
    public static void highLowNums(int[] nums, int[] highs, int n) {
        // ...
    }
}