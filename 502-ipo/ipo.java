class Solution {
    class Pair{
        int capital;
        int profit;

        Pair(int capital, int profit){
            this.capital = capital;
            this.profit = profit;
        }
    }
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<Pair> minHeap = new PriorityQueue<>(
            (a,b) ->  Integer.compare(a.capital, b.capital)
        );

        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(
            (a,b) ->  Integer.compare(b.profit, a.profit)
        );

        for(int i = 0; i<profits.length; i++){
            Pair curr = new Pair(capital[i], profits[i]);
            minHeap.add(curr);
        }

        for(int i = 0; i<k; i++){
            while(!minHeap.isEmpty() && minHeap.peek().capital <= w){
                 maxHeap.add(minHeap.poll());
            }

            if(maxHeap.isEmpty()){
                break;
            }
          
          w += maxHeap.poll().profit;
        }
        return w;
    }
}