class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int i=0;
        for(i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            nums[i]=sum;
        }
        return nums;
    }
}
