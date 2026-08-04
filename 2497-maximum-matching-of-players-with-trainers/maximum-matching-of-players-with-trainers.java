class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        
        Arrays.sort(players);
        Arrays.sort(trainers);
        int l = 0;
        int r = 0;
        int count = 0;
        
        while(l<players.length && r < trainers.length){
            if(players[l] <= trainers[r]){
                count ++;
                l++;
                r++;
            }
            else{
                r++;
            }
        }
        return count;

        
            

       
          
       
    }
}


/* 

arr = 4,7,9
brr = 2,5,8,8


*/













// Brute force // wrong approach
    // int count = 0;
    // for(int i = 0; i<players.length; i++){
    //      if(trainers.length == 1){
    //         return 1 ;
    //     }
    //     for(int j = 0; j<trainers.length; j++){
    //        if(trainers.length == 1 && players[i] > trainers[j]){
    //             return 0;
    //         }
    //         if(players[i] <= trainers[j]){
    //              count++;
    //              break;
    //         }
    //     }
       
    // }
    // return count;
   