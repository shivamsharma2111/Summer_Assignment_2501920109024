class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] ans= new int[nums1.length];
        int max=-1;
        boolean t=false;
        for(int i=0; i<nums1.length; i++){
            max=-1;
            t=false;
            for(int j=0; j<nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    t=true;
                }
                if(t==true){
                    if(nums1[i]<nums2[j]){
                    ans[i]=nums2[j];
                    max=1;
                    break;
                }
                }
            }
            if(max!=1){
                ans[i]=-1;
            }
        }
        return ans;
    }
}