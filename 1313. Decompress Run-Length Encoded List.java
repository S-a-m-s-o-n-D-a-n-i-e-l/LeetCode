class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n=nums.length;
        int len=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                len+=nums[i];
            }
        }
        int t=0;
        int[] arr=new int[len];
        for(int i=0;i<n;i+=2){
            for(int j=0;j<nums[i];j++){
                arr[t++]=nums[i+1];
            }
        }
        return arr;

    }
}
