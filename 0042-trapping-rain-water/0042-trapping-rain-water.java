class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left=0,right= n-1;
        int leftMax =0,rightMax=0;
        int TotalWater=0;
        while (left < right) {
            //Left Traverse :  We Will Work on Smaller One WHY?  Till that i have  Water
            if(height[left] <= height[right]) {
                if(height[left] >=leftMax) {
                    leftMax = height[left];
                }
                else{
                    TotalWater+=leftMax - height[left];
                }
                left++;
            }else{
                // heihgt of right is smaller than heihgt of left building
                // Right Traversal: Work On smaller one 
                if(height[right] >= rightMax) {
                    rightMax = height[right];
                }else{
                    TotalWater+= rightMax - height[right];
                }
                right--;

            }
        }

        return TotalWater;
    }
}