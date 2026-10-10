class Solution {
    int countMostFrequent(Map<Character, Integer> map){
        int count = 0;
        for(Character key: map.keySet()){
            count = Math.max(map.get(key), count);
        }
        return count;
    }

    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int i=0;
        int max = 0;
        for(int j=0; j< s.length(); j++){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0)+1);
            while((j-i+1) - countMostFrequent(map) > k){
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)-1);
                if(map.get(s.charAt(i))<=0){
                    map.remove(s.charAt(i));
                }
                i++;
            }
            max = Math.max(max, j-i+1);
        }
        return max;
    }
}
