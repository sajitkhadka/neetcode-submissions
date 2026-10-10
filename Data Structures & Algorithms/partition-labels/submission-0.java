class Solution {
    /**
        x y x x  y z b  z b b i s l
        x -> 3
        y -> 2
        z -> 2
        b -> 3
        i-> 1
        s -> 1
        l -> 1

        x -> 2
        y -> 

    */
    public List<Integer> partitionLabels(String s) {
        int[] set = new int[26];
        for(char ch: s.toCharArray()){
            set[ch-'a']++;
        }
        List<Integer> list = new ArrayList<>();
        Map<Character, Integer> window = new HashMap<>();
        int i = 0;
        for(int j=0; j<s.length(); j++){
            char ch = s.charAt(j);
            set[ch-'a']--;
            window.put(ch, set[ch-'a']);
            if(window.get(ch)==0){
                window.remove(ch);
            }
            int count = 0;
            for(char key: window.keySet()){
                if(window.getOrDefault(key,0)> 0){
                    count++;
                }
            }
            if(count == 0){
                list.add(j-i+1);
                i=j+1;
            }
        }
        return list;
    }
}
