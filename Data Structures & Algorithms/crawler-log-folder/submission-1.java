class Solution {
    public int minOperations(String[] logs) {
        int distance = 0;
        for(String log: logs){
            if(log.equals("../")){
                if(distance > 0) distance--;
            }
            else if(!log.equals("./")){
                distance++;
            }
        }
        return distance;
    }
}