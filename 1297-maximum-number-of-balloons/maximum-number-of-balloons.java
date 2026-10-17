class Solution {
    public int maxNumberOfBalloons(String text) {

        String obj = "balloon";

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> gap = new HashMap<>();

        for(int i = 0 ; i < text.length(); i++){
            char ch = text.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) + 1);
        } 

        for(int i = 0 ; i < obj.length(); i++){
            char ch = obj.charAt(i);
            gap.put(ch, gap.getOrDefault(ch,0) + 1);
        }  

        int count = Integer.MAX_VALUE;
        for(char ch : gap.keySet()){
          
            int available = map.getOrDefault(ch, 0);
            int required = gap.get(ch);

            count = Math.min(count, available / required);
           
        }

        return count;   
    }
}