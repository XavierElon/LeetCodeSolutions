class Solution {
    public int[][] merge(int[][] intervals) {
        int length = intervals.length;
        
        if (length == 0) return new int[0][];
        
        int[] beginning = new int[length];
        int[] end = new int[length];
        List<int[]> newList = new LinkedList<>();
        
        for (int i = 0; i < length; i++) {
            beginning[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        
        Arrays.sort(beginning);
        Arrays.sort(end);
        
        int prevStart = 0;
        
        for (int i = 0; i < length-1; i++){
            if (beginning[i+1] > end[i]) {
                newList.add(new int[] {beginning[prevStart], end[i]});
                prevStart = i + 1;
            }
        }
        newList.add(new int[] {beginning[prevStart], end[length-1]});
        return newList.toArray(new int[newList.size()][]);
    }
}
