class Solution {
    public int maxSubArray(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++) {
            //Move Forward do sum
            sum=sum+nums[i];
            //update max
            maxi  = Math.max(maxi,sum);
            //when you get sum -ve when adign a new ele then drop to zero
            if(sum<0) {
                sum=0;
            }
        }
        return maxi;
    }
}