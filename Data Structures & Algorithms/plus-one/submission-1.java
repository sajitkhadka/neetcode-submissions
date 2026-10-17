class Solution {
    public int[] plusOne(int[] digits) {
        int carryOver = 1;
        for(int i=digits.length-1; i>=0; i--){
            int num = digits[i] + carryOver;
            if(num > 9){
                digits[i] = num % 10;
                carryOver = 1;
            }else {
                digits[i] = num;
                carryOver = 0;
            }
        }
        if(carryOver > 0){
            int[] newNum = new int[digits.length+1];
            newNum[0] = carryOver;
            for(int i=1; i<newNum.length; i++){
               newNum[i] = digits[i-1];
            }
            return newNum;
        }
        return digits;
        
    }
}
