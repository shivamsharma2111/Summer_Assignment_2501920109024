class TwoSum{
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                 return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
        public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5, 2, 1, 5, 7};
        System.out.println(twosum(arr1, 5));
    }
}