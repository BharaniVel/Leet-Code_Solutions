class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans;
        int n = nums1.length + nums2.length;
        int[] arr = new int[n];
        System.arraycopy(nums1,0,arr,0,nums1.length);
        System.arraycopy(nums2,0,arr,nums1.length,nums2.length);
        Arrays.sort(arr);
        if(n%2==0)
        {
            int n1 = arr[arr.length/2];
            int n2 = arr[(arr.length/2)-1];
            ans = (double)(n1+n2)/2;
            return ans;
        }
        else{
            return (double)arr[arr.length/2];
        }
    }   
}