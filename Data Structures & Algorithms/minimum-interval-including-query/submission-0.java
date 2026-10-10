class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {
        int[] map = new int[10001];
        Arrays.fill(map, -1);
        for(int i=0; i<intervals.length; i++){
            int[] interval = intervals[i];
            for(int j= interval[0]; j<=interval[1]; j++){
                int existingIntervalIndex = map[j];
                if(existingIntervalIndex >= 0){
                    int[] existingInterval = intervals[existingIntervalIndex];
                    if((existingInterval[1] - existingInterval[0]) > (interval[1] - interval[0])){
                        map[j] = i;
                    }
                }else{
                    map[j] = i;
                }
            }
        }
        int[] intervalLength = new int[queries.length];
        for(int i = 0; i<queries.length; i++){
            int query = queries[i];
            int index = map[query];
            if(index < 0){
                intervalLength[i] = -1;
            }else{
                int[] interval = intervals[index];
                int length = interval[1]-interval[0] + 1;
                intervalLength[i] = length;
            }
        }
        return intervalLength;
    }
}
