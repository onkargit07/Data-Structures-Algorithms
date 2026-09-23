class Solution {
    public static void reverse(int[] nums,int i,int j) {
        int lth =i;
        int rth =j;
        while(lth<rth) {
            int tmp = nums[lth];
            nums[lth] = nums[rth];
            nums[rth] = tmp;
            lth++;
            rth--;
        }
    }
    public void rotate(int[] nums, int k) {
        // k is greater than the length
        k = k % nums.length;
        //k is negative
        if(k<0) {
            k = k + nums.length;
        }

        //part 1 :  entire given array
        reverse(nums,0,nums.length-1);
        //part 2 : rverse array of first k ele 
        reverse(nums,0,k-1);
        // part 3 : reverse the array of from
        reverse(nums,k,nums.length-1);

        
    }
}