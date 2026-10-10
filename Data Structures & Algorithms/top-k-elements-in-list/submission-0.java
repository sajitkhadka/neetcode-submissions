class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Queue<Integer> pq = new PriorityQueue<>((x1, x2)->{
           return map.get(x2) - map.get(x1);
        });
        for(int num: map.keySet()){
            pq.offer(num);
        }
        int[] output = new int[k];
        for(int i=0; i<k; i++){
            output[i] = pq.poll();
        }
        return output;
    }
}
