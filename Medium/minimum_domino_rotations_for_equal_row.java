class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        int minSwaps = Math.min(minimumSwaps(A[0], A, B), 
                                minimumSwaps(A[0], B, A));
        minSwaps = Math.min(minSwaps, minimumSwaps(B[0], A, B));
        minSwaps = Math.min(minSwaps, minimumSwaps(B[0], B, A));
        
        return minSwaps == Integer.MAX_VALUE ? -1 : minSwaps;
    }
    
    public int minimumSwaps(int target, int[] A, int[] B) {
        int swaps = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != target && B[i] != target)
                return Integer.MAX_VALUE;
            else if(A[i] != target)
                swaps++;
        }
        return swaps;
    }
}
