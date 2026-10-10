class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int longest = 0;
        int i = 0;
        for(int j=0; j<s.length(); j++){
            char cur = s.charAt(j);
            map.put(cur, map.getOrDefault(cur, 0)+1);
            while(map.getOrDefault(cur,0) > 1){
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)-1);
                i++;
            }
            longest = Math.max(longest, j-i+1);
        }
        return longest;
    }
}
