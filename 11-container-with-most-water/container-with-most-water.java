class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int l = 0;
        int r = height.length-1;
        while(l<r)
        {
            int ans1 = Math.abs(l-r) * Math.min(height[l],height[r]);
            ans = Math.max(ans,ans1);
            if(height[l]<height[r]) l++;
            else r--;
        }
        return ans;
    }
}