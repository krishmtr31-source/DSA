class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        HashMap<Character, Integer> r = new HashMap<>();
        HashMap<Character, Integer> s = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {

            char f = ransomNote.charAt(i);
            r.put(f, r.getOrDefault(f, 0) + 1);

        }

        for (int i = 0; i < magazine.length(); i++) {

            char m = magazine.charAt(i);
            s.put(m, s.getOrDefault(m, 0) + 1);

        }

        for(int i = 0 ; i < ransomNote.length(); i++){

            char f = ransomNote.charAt(i);  
          
            if(r.get(f) >  s.getOrDefault(f, 0)){
                return false;
            }
        }
        return true;

    }
}