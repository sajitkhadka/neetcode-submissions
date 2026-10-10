class Solution {
    /**
        [1]
        [2]
        [2 1 ] -> 2
        [2 0] -> 2
        [4] -> 4
        [4 2] -> 4
        [6] -> 6


    */
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] arr =new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        for(int j=0; j< nums.length; j++){
            while(!deque.isEmpty() && nums[deque.peekLast()] <= nums[j]){
                deque.pollLast();
            }

            while(!deque.isEmpty() && deque.peekFirst() < j-k+1){
                deque.pollFirst();
            }

            deque.offerLast(j);
            if(j >= k-1){
                arr[j-k+1] = nums[deque.peekFirst()];
            }
        }
        return arr;
    }
}
