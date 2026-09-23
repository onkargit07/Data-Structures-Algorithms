class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      /*
      1. Travers the array and check each ele with it's adjusnet if same then cnt++ and icrease the pointer 
         else not same then make it cnt=0; and start again cheking it's adjusnt ele if same cnt++
     2.  we have to retunr the max cnt

      */  
      int cnt=0;
      int max_cnt =0;
      for(int i=0;i<nums.length;i++) {
        if(nums[i] == 1) {
            cnt++;
        }else{
         cnt=0;
        }
        max_cnt = Math.max(max_cnt,cnt);
    }
    return max_cnt;
    }
}