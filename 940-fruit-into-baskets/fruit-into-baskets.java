class Solution {
    public int totalFruit(int[] fruits) {

        Map<Integer, Integer> map = new HashMap<>();
        int low = 0;
        int ans = -1;

        for (int high = 0; high < fruits.length; high++) {
            map.put(fruits[high], map.getOrDefault(fruits[high], 0) + 1);

            while (map.size() > 2) {
                map.put(fruits[low], map.get(fruits[low]) - 1);
                if (map.get(fruits[low]) == 0) {
                    map.remove(fruits[low]);
                }
                low++;
            }

            if (map.size() <= 2) {
               int len = high - low + 1;
                ans = Math.max(ans, len);
            }
        }

    return ans;

}}