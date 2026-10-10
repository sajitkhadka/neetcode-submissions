class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        const map = {}
        for(const num of nums){
            map[num] = map[num] || 0;
            if(++map[num] > 1) return true;
        }
        return false;
    }
}
