class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int arr[] = new int[n];
        int t = 0;
        for(int i = 0; i < nums.length; i = i + 2){
            int a = nums[i];
            int b = nums[i + 1];
            arr[t++] = b;
            arr[t++] = a;
        }
        return arr;
    }
}