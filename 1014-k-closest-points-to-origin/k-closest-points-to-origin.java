class Solution {
    class Pair {
        long first;
        int second;

        Pair(long f, int s) {
            first = f;
            second = s;
        }
    }

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> Long.compare(b.first, a.first)
        );

        for(int i = 0; i<points.length; i++){
            int index = i;
            long dis = distance(points, points[i][0], points[i][1]);
            Pair curr = new Pair(dis , index);

            if(pq.size() < k){
                pq.add(curr);
            }

            else if(curr.first < pq.peek().first){
                pq.remove();
                pq.add(curr);
            }
        }
        int[][] ans = new int[k][2];
        for(int i = 0; i<k; i++){
            Pair curr = pq.remove();
            ans[i] = points[curr.second];
        }
        return ans;


    }

    private static long distance(int[][] points, int first, int second) {
        return (long) first * first + (long) second * second;
    }
}