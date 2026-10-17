class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> notes = new HashMap<>();
        for(char ch: magazine.toCharArray()){
            notes.put(ch, notes.getOrDefault(ch,0)+1);
        }
        for(char ch: ransomNote.toCharArray()){
            if(notes.getOrDefault(ch,0) > 0){
                notes.put(ch, notes.getOrDefault(ch,0)-1);
            }else {
                return false;
            }
        }
        return true;
    }
}