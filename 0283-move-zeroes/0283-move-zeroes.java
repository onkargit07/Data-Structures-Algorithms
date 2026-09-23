class Solution {
    public void moveZeroes(int[] nums) {
       // Two Pointer Approach partilaly
       //find the first index of zero ele in an array
       int j=0;
       boolean zerofound = false;
       for(int i=0;i<nums.length;i++) {
        if(nums[i]==0){
           j=i;
           zerofound = true;
           break;
        }
       }
       if(!zerofound) {
        return;
       }
       //edge case 
       if(j==nums.length) {
        return;
       }

       // travers the array
       for(int i=j+1;i<nums.length;i++) {
        if(nums[i]!=0) {
            int tmp = nums[i];
            nums[i] =nums[j];
            nums[j]=tmp;
            j++;
        }
        
       }
    }
}