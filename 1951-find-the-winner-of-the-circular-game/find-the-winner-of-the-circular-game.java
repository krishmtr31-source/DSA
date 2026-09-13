class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> persons = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            persons.add(i);
        }
        k--;
        int index = 0;
        return solve(persons,k,index);
    } 
    static int solve( ArrayList<Integer> persons, int k, int index){
        if(persons.size() == 1){
            return persons.get(0);
        }
        index = (index + k) % persons.size();
        persons.remove(index);
        return solve(persons,k,index);
    }
}