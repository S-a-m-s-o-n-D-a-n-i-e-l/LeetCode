class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=-1;
        }
        for(int i=0;i<n;i++){
            if(arr[index[i]]==-1){
                arr[index[i]]=nums[i];
            }else{
                for(int j=n-1;j>=index[i];j--){
                    if(arr[j]!=-1){
                        int temp=arr[j];
                        arr[j+1]=temp;
                    }
                }
                arr[index[i]]=nums[i];
            }
        }
        return arr;
        
    }
}
