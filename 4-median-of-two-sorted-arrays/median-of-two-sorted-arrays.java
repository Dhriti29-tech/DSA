class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] arr=new int[n+m];
        int j=0;
        for(int i=0;i<nums1.length;i++){
            arr[j]=nums1[i];
            j++;
        }
        for(int i=0;i<nums2.length;i++){
            arr[j]=nums2[i];
            j++;
        }
        Arrays.sort(arr);
        if((n+m)%2!=0){
            int mid=arr.length/2;
            return arr[mid];
        }else{
            int mid1=(arr.length/2)-1;
            int mid2=arr.length/2;
            return (arr[mid1]+arr[mid2])/2.0;
        }   
    }
}