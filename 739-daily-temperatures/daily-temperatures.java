class Solution {

    class Pair {
       int index;
       int value;

       Pair(int i, int v){
          index = i;
         value = v;
       }
    } 


    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Pair> s = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();

        // if(s.size() == 1){
        //    res.add(0);
        //    s.push(temperatures[n-1]);
        // }
      

        for(int i = n-1; i >= 0; i--){
            while(s.size() != 0 && temperatures[i] >= s.peek().value){
                s.pop();
            }
            if(s.size() == 0){
                res.add(0);
            }
            else{
                res.add(s.peek().index-i);
            }
            s.push(new Pair(i,temperatures[i]));
        }


        Collections.reverse(res);


        int[] result = new int[res.size()];

        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        return result;
    }   
}