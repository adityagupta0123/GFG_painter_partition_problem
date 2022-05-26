class Solution{
    static long minTime(int[] arr,int n,int m){
        long s =0;
        long sum=0;
        for(int  i=0; i<n ; i++){
           sum += arr[i];
        }
        long e = sum ;
        long ans=-1;
        while( s <= e){
            long mid = s + (e-s)/2;
            if(isPossible(arr, n, m, mid)){
                e = mid -1;
                ans = mid;
            }else{
                s = mid +1;
            }
        }
        return ans;
    }
    static boolean isPossible(int []arr, int n, int m, long mid){
        int pCount = 1;
        long area = 0;
        for(int i=0; i<n ;i++){
        if(area + arr[i] <= mid){
            area += arr[i];
        }
        else{
            pCount++;
            if(pCount > m || arr[i] > mid)
               return false;
            area = arr[i];
        }}
        return true;
    }
}
