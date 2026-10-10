class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while(true){
            int sum = 0;
            while(n != 0){
                int r = n % 10;
                sum += r * r;
                n /= 10;
            }
            if(sum == 1) return true;
            if(seen.contains(sum)) {
                return false;
            }
            n = sum;
            seen.add(sum);
        }
    }
}
