class Solution {
    public int[] decode(int[] encoded, int first) {
        int n=encoded.length;
        int[] arr=new int[n+1];
        int idx=0;
        arr[idx]=first;
        for(int i=0;i<n;i++){
            int temp=encoded[i]^arr[idx];
            arr[++idx]=temp;
        }
        return arr;
        
    }
}
