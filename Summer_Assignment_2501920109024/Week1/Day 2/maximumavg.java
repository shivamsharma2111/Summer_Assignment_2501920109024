class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double maxav = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (i >= k - 1) {
                maxav = Math.max(maxav, sum / k);
                sum -= nums[i - k + 1];
            }
        }
        return maxav;
    }
}