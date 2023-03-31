/*Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:

answer.length == nums.length.
answer[i] = |leftSum[i] - rightSum[i]|.
Where:

leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
Return the array answer.*/
  
class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int[] arr=new int[nums.length];
        int[] brr=new int[nums.length];
        arr[0]=0;
        brr[nums.length-1]=0;
        int sum=0;
        for(int i=1;i<nums.length;i++)
        {
            sum+=nums[i-1];
            arr[i]=sum;
        }
        sum=0;
        for(int i=nums.length-2;i>=0;i--)
        {
            sum+=nums[i+1];
            brr[i]=sum;
        }
        for(int i=0;i<nums.length;i++)
        {
            int diff=arr[i]-brr[i];
            if(diff<0)
            {
                arr[i]=diff*-1;
            }else{
                arr[i]=diff;
            }
        }
        return arr;
    }
}
