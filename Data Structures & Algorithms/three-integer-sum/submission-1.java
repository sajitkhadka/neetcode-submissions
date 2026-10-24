class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      //  -4, -1, -1, 0, 1, 2
      Arrays.sort(nums);
      List<List<Integer>> list = new ArrayList<>();

      for(int i=0; i<nums.length; i++){
        if(i > 0 && nums[i] == nums[i-1]) continue;
        int num = nums[i];
        int l = i+1, r = nums.length-1;
        while(l < r){
            if(num + nums[l] + nums[r] == 0){
                list.add(Arrays.asList(num, nums[l], nums[r]));
                l++;
                r--;

                // Skip duplicate left values
                while (l < r && nums[l] == nums[l - 1]) {
                    l++;
                }

                // Skip duplicate right values
                while (l < r && nums[r] == nums[r + 1]) {
                    r--;
                }
            }
            else if(num + nums[l] + nums[r] < 0){
                l++;
            }else {
                r--;
            }
        }
      }
      return list;
    }
}
