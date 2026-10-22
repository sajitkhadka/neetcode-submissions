class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            if(!map.containsKey(num)){
                map.put(num, i);
            }
        }
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            int targetNum = target - num;
            if(map.containsKey(targetNum) && i != map.get(targetNum)){
                if(num == targetNum) return new int[]{ map.get(targetNum), i};
                return new int[]{i, map.get(targetNum)};
            }
        }
        return new int[]{};
    }
}
