class Solution {
    /**
        [1,2,-3,4]
        current_max => 4
        current_min => -6
        total_max => 4

        O(n) time complexity
        O(1) space complexity
    */
    public int maxProduct(int[] nums) {
       int currentMax = 1;
       int currentMin = 1;
       int max = nums[0];
        for(int num: nums){
            int tempMax = currentMax;
            currentMax = Math.max(num, Math.max(num*currentMax, num*currentMin));
            currentMin = Math.min(num, Math.min(num*tempMax, num*currentMin));
            max = Math.max(currentMax, max);
        }
        return max;

    }

}
