class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        char[] str = s.toCharArray();
        for(int i=1; i<str.length; i++){
            sum += Math.abs(str[i] - str[i-1]);
        }
        return sum;
    }
}