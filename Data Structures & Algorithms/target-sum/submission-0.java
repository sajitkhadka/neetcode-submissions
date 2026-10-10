class Solution {

    public int recurse(int index, int[] nums, int currentSum, int target){
        if(index >= nums.length){
            if(currentSum == target) return 1;
            else return 0;
        }
        return recurse(index+1, nums, currentSum + nums[index], target)+
            recurse(index+1, nums, currentSum-nums[index], target);

    }
    public int findTargetSumWays(int[] nums, int target) {
        return recurse(0, nums, 0, target);
    }
}
