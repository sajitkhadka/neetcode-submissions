class Solution {
    public String largestGoodInteger(String num) {
        int largest = -1;
        String largestStr = "";
        for(int i=2; i<num.length(); i++){
            char ch = num.charAt(i);
            if(ch == num.charAt(i-1) && ch == num.charAt(i-2)){
                String temp = num.substring(i-2, i+1);
                int n = Integer.parseInt(temp);
                if(largest < n){
                    largest = n;
                    largestStr = temp;
                }
            }
        }
        return largestStr;
    }
}