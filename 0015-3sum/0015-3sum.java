class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        // To  Store the Unique Triplet
        Set<List<Integer>> uniqueTriplet = new HashSet<>();
        //Generate all triplet
        for(int i=0;i<n;i++) {
            Set<Integer> st = new HashSet<>();

            for(int j=i+1;j<n;j++) {
               int third_ele = -(nums[i] + nums[j]);
               if(st.contains(third_ele)) {
                //crate a triplet
                ArrayList<Integer> triplet = new ArrayList<>();
                triplet.add(nums[i]);
                triplet.add(nums[j]);
                triplet.add(third_ele);

                //sort thr triplet
                Collections.sort(triplet);
                //add intot the set
                uniqueTriplet.add(triplet);
               }
               //if third ele is not exist in the set
               st.add(nums[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(uniqueTriplet);
        //Retur the triplt values based on return type
        return ans;

        
    }
}