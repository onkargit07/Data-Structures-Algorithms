class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0,candidate=-1;

        for(int i=0;i<nums.length;i++) {
            if(cnt==0) {
                candidate = nums[i];
                cnt=1;
            }else{
                if(candidate == nums[i]) {
                    cnt++;
                }else{
                    cnt--;
                }
            }
        }

        int cnt1=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==candidate) {
                cnt1++;
            }
        }

        if(cnt1 > nums.length / 2) {
            return candidate;
        }

        //No MAJORITY ELE IS EXITS IN GIVEN ARRAY
        return -1;
    }
}