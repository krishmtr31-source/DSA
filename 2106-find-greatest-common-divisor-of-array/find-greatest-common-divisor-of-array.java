class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        return gcd(nums[0], nums[n-1]);
    }

    static int gcd(int a , int b){
        if(a == 0){
            return b;
        }

        return gcd(b % a, a);
    }
}