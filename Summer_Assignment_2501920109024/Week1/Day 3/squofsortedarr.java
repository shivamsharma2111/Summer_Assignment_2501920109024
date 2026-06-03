class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int k=j;
        int [] sor=new int[nums.length];
        while(i<=j){
            if(Math.abs(nums[i])<Math.abs(nums[j])){
                sor[k]=nums[j]*nums[j];
                j--;
                k--;
            }
            else{
                sor[k]=nums[i]*nums[i];
                i++;
                k--;
            }
        }
        return sor;
    }
}