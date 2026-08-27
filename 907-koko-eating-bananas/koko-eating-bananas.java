class Solution {
    // this is a helper function ->
    static long findhours(int[] piles, int k) {
        long hour = 0;

        for (int i = 0; i < piles.length; i++) {
            hour = hour + piles[i] / k;
            if (piles[i] % k != 0) {
                hour++;
            }
        }
        return  hour;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int high = 0;
        for(int i = 0; i<n; i++){
            high = Math.max(piles[i], high);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long hour = findhours(piles, mid);

            if (hour > h) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return low;
    }
}