class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            String string = Integer.toString(nums[i]);
            int length = string.length();
            if(length%2==0) count++;
        }
        return count;
    }
}