class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen = 0;
        int i = 0;
        int j = -1;
        /*
        Sliding Window + Two Pointer
        */
        int cntZeroInWindow = 0;
        while( i < nums.length) {
            // Aquire first
            if(nums[i] == 0){
              cntZeroInWindow = cntZeroInWindow + 1;
              i++;
            }else{
                // nums[i] = 1
                i++;
            }

            //Releas 
            while( cntZeroInWindow > k ) {
                //Ivalid --> make it valid
                //releas the left ele
                j++;
                if(nums[j] == 0) {
                  
                    cntZeroInWindow = cntZeroInWindow - 1;
                }else{
                    //do nothing
                }
            }
           int size = i - j - 1;
          maxLen = Math.max(maxLen, size);
        }
        return maxLen;
    }
}