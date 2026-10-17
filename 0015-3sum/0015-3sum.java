class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> uniqueTriplet = new HashSet<>();
        int n = nums.length;
        // Partially Two  Pointer Approach.
        for(int i=0;i<n;i++) {
            Set<Integer> seen = new HashSet<>();
            for(int j=i+1;j<n;j++) {
                int third_ele = -(nums[i] + nums[j]);
                if(seen.contains(third_ele)) {
                    List<Integer> triplet = Arrays.asList(nums[i],nums[j],third_ele);
                    Collections.sort(triplet);
                    uniqueTriplet.add(triplet);
                }
                seen.add(nums[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(uniqueTriplet);

        return ans;
    }
}