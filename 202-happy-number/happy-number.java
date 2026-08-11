class Solution {
    public boolean isHappy(int n) {
        // floyid cycle detection
        int slow = n;
        int fast = n;


       while(fast != 1){
            slow = findSquare(slow);           // move one step
            fast = findSquare(findSquare(fast)); // move two step ahead;

            if(slow == fast && slow != 1){
               return false;
            }
        }
        return true;
      
    }
    private int findSquare(int number){
        int sum = 0;
        while(number > 0) {
            int dig = number % 10;
            sum += dig*dig;
            number /= 10;
        }
        return sum;
    }
}























  




