class Solution {
    public int getSum(int a, int b) {
        while(b != 0){
            int sum = a ^ b;
            int carryOver = a & b;
            carryOver = carryOver << 1;
            a = sum;
            b = carryOver;
        }
        return a;
    }
}
