class Solution {
    public int mySqrt(int n) {
        

        int s = 0;
        int e = n;

        double root = 0.0;


        while(s <= e){
            int m = s + (e-s) / 2;



            if((long)m * m == n){
                return m;
            }
            else if((long)m * m > n){
                e = m - 1;
            }
            else{
                s = m + 1;
            }
        }

       

        return s-1 ;
    }
}